package gregtech.loaders.oreprocessing;

import gregtech.api.enums.ItemList;
import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingOre implements gregtech.api.interfaces.IOreRecipeRegistrator {
    private ArrayList<Materials> mAlreadyListedOres = new ArrayList(1000);

    public ProcessingOre() {
        for (OrePrefixes tPrefix : OrePrefixes.values())
            if ((tPrefix.name().startsWith("ore")) && (tPrefix != OrePrefixes.orePoor) && (tPrefix != OrePrefixes.oreSmall) && (tPrefix != OrePrefixes.oreRich) && (tPrefix != OrePrefixes.oreNormal))
                tPrefix.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        boolean tIsRich = (aPrefix == OrePrefixes.oreNether) || (aPrefix == OrePrefixes.oreEnd) || (aPrefix == OrePrefixes.oreDense);

        if (aMaterial == Materials.get("Oilsands")) {
            RECIPE_ADDER_INSTANCE.addCentrifugeRecipe(GT_Utility.copyAmount(1L, aStack), null, null, Materials.get("Oil").getFluid(tIsRich ? 1000L : 500L), new ItemStack(net.minecraft.init.Blocks.sand, 1, 0), null, null, null, null, null, new int[]{tIsRich ? '?' : '?'}, tIsRich ? 2000 : 1000, 5);
        } else {
            registerStandardOreRecipes(aPrefix, aMaterial, GT_Utility.copyAmount(1L, aStack), Math.max(1, gregtech.api.GregTech_API.sOPStuff.get(gregtech.api.enums.ConfigCategories.Materials.oreprocessingoutputmultiplier, aMaterial.toString(), 1)) * (tIsRich ? 2 : 1));
        }
    }

    private boolean registerStandardOreRecipes(OrePrefixes aPrefix, Materials aMaterial, ItemStack aOreStack, int aMultiplier) {
        if ((aOreStack == null) || (aMaterial == null)) return false;
        GT_ModHandler.addValuableOre(GT_Utility.getBlockFromStack(aOreStack), aOreStack.getItemDamage(), aMaterial.getOreValue());
        Materials tMaterial = aMaterial.getOreReplacement();
        Materials tPrimaryByMaterial = null;
        Materials tSecondaryByMaterial = null;
        aMultiplier = Math.max(1, aMultiplier);
        aOreStack = GT_Utility.copyAmount(1L, aOreStack);
        aOreStack.stackSize = 1;


        ItemStack tIngot = GT_OreDictUnificator.get(OrePrefixes.ingot, aMaterial.getDirectSmelting(), 1L);
        ItemStack tGem = GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial, 1L);
        ItemStack tSmeltInto = tIngot == null ? null : aMaterial.contains(SubTag.SMELTING_TO_GEM) ? GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial.getDirectSmelting(), GT_OreDictUnificator.get(OrePrefixes.crystal, tMaterial.getDirectSmelting(), GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial, GT_OreDictUnificator.get(OrePrefixes.crystal, tMaterial, 1L), 1L), 1L), 1L) : tIngot;

        ItemStack tSmall = GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMaterial, 1L);
        ItemStack tDust = GT_OreDictUnificator.get(OrePrefixes.dust, tMaterial, tGem, 1L);
        ItemStack tCleaned = GT_OreDictUnificator.get(OrePrefixes.crushedPurified, tMaterial, tDust, 1L);
        ItemStack tCrushed = GT_OreDictUnificator.get(OrePrefixes.crushed, tMaterial, aMaterial.getOreMultiplier() * aMultiplier);
        ItemStack tPrimaryByProduct = null;
        ItemStack tPrimaryByProductSmall = null;
        ItemStack tSecondaryByProduct = null;
        ItemStack tSecondaryByProductSmall = null;

        if (tCrushed == null) {
            tCrushed = GT_OreDictUnificator.get(OrePrefixes.dustImpure, tMaterial, GT_Utility.copyAmount(aMaterial.getOreMultiplier() * aMultiplier, tCleaned, tDust, tGem), aMaterial.getOreMultiplier() * aMultiplier);
        }

        ArrayList<ItemStack> tByProductStacks = new ArrayList();

        for (Materials tMat : aMaterial.getOreByProducts()) {
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
            if ((aMaterial.isBlastFurnaceRequired()) || (aMaterial.getDirectSmelting().isBlastFurnaceRequired())) {
                GT_ModHandler.removeFurnaceSmelting(aOreStack);
            } else {
                GT_ModHandler.addInductionSmelterRecipe(aOreStack, new ItemStack(net.minecraft.init.Blocks.sand, 1), GT_Utility.mul(aMultiplier * (aMaterial.contains(SubTag.INDUCTIONSMELTING_LOW_OUTPUT) ? 1 : 2) * aMaterial.getSmeltingMultiplier(), tSmeltInto), ItemList.TE_Slag_Rich.get(1L), 300 * aMultiplier, 10 * aMultiplier);
                GT_ModHandler.addInductionSmelterRecipe(aOreStack, ItemList.TE_Slag_Rich.get(aMultiplier), GT_Utility.mul(aMultiplier * (aMaterial.contains(SubTag.INDUCTIONSMELTING_LOW_OUTPUT) ? 2 : 3) * aMaterial.getSmeltingMultiplier(), tSmeltInto), ItemList.TE_Slag.get(aMultiplier), 300 * aMultiplier, 95);
                tHasSmelting = GT_ModHandler.addSmeltingRecipe(aOreStack, GT_Utility.copyAmount(aMultiplier * aMaterial.getSmeltingMultiplier(), tSmeltInto));
            }

            if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_TRIPLE)) {
                RECIPE_ADDER_INSTANCE.addBlastRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Calcite"), aMultiplier), null, null, GT_Utility.mul(aMultiplier * 3 * aMaterial.getSmeltingMultiplier(), tSmeltInto), ItemList.TE_Slag.get(1L, GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.get("DarkAsh"), 1L)), tSmeltInto.stackSize * 500, 120, 1500);
            } else if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_DOUBLE)) {
                RECIPE_ADDER_INSTANCE.addBlastRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Calcite"), aMultiplier), null, null, GT_Utility.mul(aMultiplier * 2 * aMaterial.getSmeltingMultiplier(), tSmeltInto), ItemList.TE_Slag.get(1L, GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.get("DarkAsh"), 1L)), tSmeltInto.stackSize * 500, 120, 1500);
            }
        }

        if (!tHasSmelting) {
            tHasSmelting = GT_ModHandler.addSmeltingRecipe(aOreStack, GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial.getDirectSmelting(), Math.max(1, aMultiplier * aMaterial.getSmeltingMultiplier() / 2)));
        }

        if (tCrushed != null) {
            RECIPE_ADDER_INSTANCE.addForgeHammerRecipe(aOreStack, GT_Utility.copy(GT_Utility.copyAmount(tCrushed.stackSize, tGem), tCrushed), 16, 10);
            GT_ModHandler.addPulverisationRecipe(aOreStack, GT_Utility.mul(2L, tCrushed), tMaterial.contains(SubTag.PULVERIZING_CINNABAR) ? GT_OreDictUnificator.get(OrePrefixes.crystal, Materials.get("Cinnabar"), GT_OreDictUnificator.get(OrePrefixes.gem, tPrimaryByMaterial, GT_Utility.copyAmount(1L, tPrimaryByProduct), 1L), 1L) : GT_OreDictUnificator.get(OrePrefixes.gem, tPrimaryByMaterial, GT_Utility.copyAmount(1L, tPrimaryByProduct), 1L), tPrimaryByProduct == null ? 0 : tPrimaryByProduct.stackSize * 10 * aMultiplier * aMaterial.getByProductMultiplier(), GT_OreDictUnificator.getDust(aPrefix.mSecondaryMaterial), 50, true);
        }
        return true;
    }
}
