package gregtech.loaders.oreprocessing;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.MaterialsOld;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingOre implements gregtech.api.interfaces.IOreRecipeRegistrator {
    private ArrayList<MaterialsOld> mAlreadyListedOres = new ArrayList(1000);

    public ProcessingOre() {
        for (OrePrefixes tPrefix : OrePrefixes.values())
            if ((tPrefix.name().startsWith("ore")) && (tPrefix != OrePrefixes.orePoor) && (tPrefix != OrePrefixes.oreSmall) && (tPrefix != OrePrefixes.oreRich) && (tPrefix != OrePrefixes.oreNormal))
                tPrefix.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, MaterialsOld aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        boolean tIsRich = (aPrefix == OrePrefixes.oreNether) || (aPrefix == OrePrefixes.oreEnd) || (aPrefix == OrePrefixes.oreDense);

        if (aMaterial == MaterialsOld.Oilsands) {
            RECIPE_ADDER_INSTANCE.addCentrifugeRecipe(GT_Utility.copyAmount(1L, aStack), null, null, MaterialsOld.Oil.getFluid(tIsRich ? 1000L : 500L), new ItemStack(net.minecraft.init.Blocks.sand, 1, 0), null, null, null, null, null, new int[]{tIsRich ? '?' : '?'}, tIsRich ? 2000 : 1000, 5);
        } else {
            registerStandardOreRecipes(aPrefix, aMaterial, GT_Utility.copyAmount(1L, aStack), Math.max(1, gregtech.api.GregTech_API.sOPStuff.get(gregtech.api.enums.ConfigCategories.Materials.oreprocessingoutputmultiplier, aMaterial.toString(), 1)) * (tIsRich ? 2 : 1));
        }
    }

    private boolean registerStandardOreRecipes(OrePrefixes aPrefix, MaterialsOld aMaterial, ItemStack aOreStack, int aMultiplier) {
        if ((aOreStack == null) || (aMaterial == null)) return false;
        GT_ModHandler.addValuableOre(GT_Utility.getBlockFromStack(aOreStack), aOreStack.getItemDamage(), aMaterial.mOreValue);
        MaterialsOld tMaterial = aMaterial.mOreReplacement;
        MaterialsOld tPrimaryByMaterial = null;
        MaterialsOld tSecondaryByMaterial = null;
        aMultiplier = Math.max(1, aMultiplier);
        aOreStack = GT_Utility.copyAmount(1L, aOreStack);
        aOreStack.stackSize = 1;


        ItemStack tIngot = GT_OreDictUnificator.get(OrePrefixes.ingot, aMaterial.mDirectSmelting, 1L);
        ItemStack tGem = GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial, 1L);
        ItemStack tSmeltInto = tIngot == null ? null : aMaterial.contains(SubTag.SMELTING_TO_GEM) ? GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial.mDirectSmelting, GT_OreDictUnificator.get(OrePrefixes.crystal, tMaterial.mDirectSmelting, GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial, GT_OreDictUnificator.get(OrePrefixes.crystal, tMaterial, 1L), 1L), 1L), 1L) : tIngot;

        ItemStack tSmall = GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMaterial, 1L);
        ItemStack tDust = GT_OreDictUnificator.get(OrePrefixes.dust, tMaterial, tGem, 1L);
        ItemStack tCleaned = GT_OreDictUnificator.get(OrePrefixes.crushedPurified, tMaterial, tDust, 1L);
        ItemStack tCrushed = GT_OreDictUnificator.get(OrePrefixes.crushed, tMaterial, aMaterial.mOreMultiplier * aMultiplier);
        ItemStack tPrimaryByProduct = null;
        ItemStack tPrimaryByProductSmall = null;
        ItemStack tSecondaryByProduct = null;
        ItemStack tSecondaryByProductSmall = null;

        if (tCrushed == null) {
            tCrushed = GT_OreDictUnificator.get(OrePrefixes.dustImpure, tMaterial, GT_Utility.copyAmount(aMaterial.mOreMultiplier * aMultiplier, tCleaned, tDust, tGem), aMaterial.mOreMultiplier * aMultiplier);
        }

        ArrayList<ItemStack> tByProductStacks = new ArrayList();

        for (MaterialsOld tMat : aMaterial.mOreByProducts) {
            ItemStack tByProduct = GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
            if (tByProduct != null) tByProductStacks.add(tByProduct);
            if (tPrimaryByProduct == null) {
                tPrimaryByMaterial = tMat;
                tPrimaryByProduct = GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
                tPrimaryByProductSmall = GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMat, 1L);
                if (tPrimaryByProductSmall == null)
                    tPrimaryByProductSmall = GT_OreDictUnificator.get(OrePrefixes.dustTiny, tMat, GT_OreDictUnificator.get(OrePrefixes.nugget, tMat, 2L), 2L);
            }
            if ((tSecondaryByProduct == null) || (tSecondaryByMaterial == tPrimaryByMaterial)) {
                tSecondaryByMaterial = tMat;
                tSecondaryByProduct = GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
                tSecondaryByProductSmall = GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMat, 1L);
                if (tSecondaryByProductSmall == null) {
                    tSecondaryByProductSmall = GT_OreDictUnificator.get(OrePrefixes.dustTiny, tMat, GT_OreDictUnificator.get(OrePrefixes.nugget, tMat, 2L), 2L);
                }
            }
        }
        if ((!tByProductStacks.isEmpty()) && (!this.mAlreadyListedOres.contains(aMaterial))) {
            this.mAlreadyListedOres.add(aMaterial);
            gregtech.api.util.GT_Recipe.GT_Recipe_Map.sByProductList.addFakeRecipe(false, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ore, aMaterial, aOreStack, 1L)}, tByProductStacks.toArray(new ItemStack[tByProductStacks.size()]), null, null, null, null, 0, 0, 0);
        }

        if (tPrimaryByMaterial == null) tPrimaryByMaterial = tMaterial;
        if (tPrimaryByProduct == null) tPrimaryByProduct = tDust;
        if (tPrimaryByProductSmall == null) {
            tPrimaryByProductSmall = tSmall;
        }
        if (tSecondaryByMaterial == null) tSecondaryByMaterial = tPrimaryByMaterial;
        if (tSecondaryByProduct == null) tSecondaryByProduct = tPrimaryByProduct;
        if (tSecondaryByProductSmall == null) {
            tSecondaryByProductSmall = tPrimaryByProductSmall;
        }
        boolean tHasSmelting = false;

        if (tSmeltInto != null) {
            if ((aMaterial.mBlastFurnaceRequired) || (aMaterial.mDirectSmelting.mBlastFurnaceRequired)) {
                GT_ModHandler.removeFurnaceSmelting(aOreStack);
            } else {
                GT_ModHandler.addInductionSmelterRecipe(aOreStack, new ItemStack(net.minecraft.init.Blocks.sand, 1), GT_Utility.mul(aMultiplier * (aMaterial.contains(SubTag.INDUCTIONSMELTING_LOW_OUTPUT) ? 1 : 2) * aMaterial.mSmeltingMultiplier, tSmeltInto), ItemList.TE_Slag_Rich.get(1L), 300 * aMultiplier, 10 * aMultiplier);
                GT_ModHandler.addInductionSmelterRecipe(aOreStack, ItemList.TE_Slag_Rich.get(aMultiplier), GT_Utility.mul(aMultiplier * (aMaterial.contains(SubTag.INDUCTIONSMELTING_LOW_OUTPUT) ? 2 : 3) * aMaterial.mSmeltingMultiplier, tSmeltInto), ItemList.TE_Slag.get(aMultiplier), 300 * aMultiplier, 95);
                tHasSmelting = GT_ModHandler.addSmeltingRecipe(aOreStack, GT_Utility.copyAmount(aMultiplier * aMaterial.mSmeltingMultiplier, tSmeltInto));
            }

            if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_TRIPLE)) {
                RECIPE_ADDER_INSTANCE.addBlastRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Calcite, aMultiplier), null, null, GT_Utility.mul(aMultiplier * 3 * aMaterial.mSmeltingMultiplier, tSmeltInto), ItemList.TE_Slag.get(1L, GT_OreDictUnificator.get(OrePrefixes.dustSmall, MaterialsOld.DarkAsh, 1L)), tSmeltInto.stackSize * 500, 120, 1500);
            } else if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_DOUBLE)) {
                RECIPE_ADDER_INSTANCE.addBlastRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Calcite, aMultiplier), null, null, GT_Utility.mul(aMultiplier * 2 * aMaterial.mSmeltingMultiplier, tSmeltInto), ItemList.TE_Slag.get(1L, GT_OreDictUnificator.get(OrePrefixes.dustSmall, MaterialsOld.DarkAsh, 1L)), tSmeltInto.stackSize * 500, 120, 1500);
            }
        }

        if (!tHasSmelting) {
            tHasSmelting = GT_ModHandler.addSmeltingRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial.mDirectSmelting, Math.max(1, aMultiplier * aMaterial.mSmeltingMultiplier / 2)));
        }

        if (tCrushed != null) {
            RECIPE_ADDER_INSTANCE.addForgeHammerRecipe(aOreStack, GT_Utility.copy(GT_Utility.copyAmount(tCrushed.stackSize, tGem), tCrushed), 16, 10);
            GT_ModHandler.addPulverisationRecipe(aOreStack, GT_Utility.mul(2L, tCrushed), tMaterial.contains(SubTag.PULVERIZING_CINNABAR) ? GT_OreDictUnificator.get(OrePrefixes.crystal, MaterialsOld.Cinnabar, GT_OreDictUnificator.get(OrePrefixes.gem, tPrimaryByMaterial, GT_Utility.copyAmount(1L, tPrimaryByProduct), 1L), 1L) : GT_OreDictUnificator.get(OrePrefixes.gem, tPrimaryByMaterial, GT_Utility.copyAmount(1L, tPrimaryByProduct), 1L), tPrimaryByProduct == null ? 0 : tPrimaryByProduct.stackSize * 10 * aMultiplier * aMaterial.mByProductMultiplier, GT_OreDictUnificator.getDust(aPrefix.mSecondaryMaterial), 50, true);
        }
        return true;
    }
}
