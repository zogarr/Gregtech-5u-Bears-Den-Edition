package gregtech.api.util;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ConfigCategories;
import gregtech.api.enums.MaterialsOld;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.enums.TC_Aspects;
import gregtech.api.enums.TC_Aspects.TC_AspectStack;
import gregtech.api.interfaces.internal.IThaumcraftCompat;
import gregtech.api.objects.ItemData;
import gregtech.api.objects.MaterialStack;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.api.enums.GT_Values.FLUID_MATERIAL_UNIT;
import static gregtech.api.enums.GT_Values.MATERIAL_UNIT;
import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

/**
 * Class for Automatic Recipe registering.
 */
public class GT_RecipeRegistrator {
    /**
     * List of MaterialsOld, which are used in the Creation of Sticks. All Rod MaterialsOld are automatically added to this List.
     */
    public static final List<MaterialsOld> sRodMaterialList = new ArrayList<MaterialsOld>();
    private static final ItemStack sMt1 = new ItemStack(Blocks.dirt, 1, 0), sMt2 = new ItemStack(Blocks.dirt, 1, 0);
    private static final String s_H = "h", s_F = "f", s_I = "I", s_P = "P", s_R = "R";
    private static final ItemStack[][]
            sShapes1 = new ItemStack[][]{
            {sMt1, null, sMt1, sMt1, sMt1, sMt1, null, sMt1, null},
            {sMt1, null, sMt1, sMt1, null, sMt1, sMt1, sMt1, sMt1},
            {null, sMt1, null, sMt1, sMt1, sMt1, sMt1, null, sMt1},
            {sMt1, sMt1, sMt1, sMt1, null, sMt1, null, null, null},
            {sMt1, null, sMt1, sMt1, sMt1, sMt1, sMt1, sMt1, sMt1},
            {sMt1, sMt1, sMt1, sMt1, null, sMt1, sMt1, null, sMt1},
            {null, null, null, sMt1, null, sMt1, sMt1, null, sMt1},
            {null, sMt1, null, null, sMt1, null, null, sMt2, null},
            {sMt1, sMt1, sMt1, null, sMt2, null, null, sMt2, null},
            {null, sMt1, null, null, sMt2, null, null, sMt2, null},
            {sMt1, sMt1, null, sMt1, sMt2, null, null, sMt2, null},
            {null, sMt1, sMt1, null, sMt2, sMt1, null, sMt2, null},
            {sMt1, sMt1, null, null, sMt2, null, null, sMt2, null},
            {null, sMt1, sMt1, null, sMt2, null, null, sMt2, null},
            {null, sMt1, null, sMt1, null, null, null, sMt1, sMt2},
            {null, sMt1, null, null, null, sMt1, sMt2, sMt1, null},
            {null, sMt1, null, sMt1, null, sMt1, null, null, sMt2},
            {null, sMt1, null, sMt1, null, sMt1, sMt2, null, null},
            {null, sMt2, null, null, sMt1, null, null, sMt1, null},
            {null, sMt2, null, null, sMt2, null, sMt1, sMt1, sMt1},
            {null, sMt2, null, null, sMt2, null, null, sMt1, null},
            {null, sMt2, null, sMt1, sMt2, null, sMt1, sMt1, null},
            {null, sMt2, null, null, sMt2, sMt1, null, sMt1, sMt1},
            {null, sMt2, null, null, sMt2, null, sMt1, sMt1, null},
            {sMt1, null, null, null, sMt2, null, null, null, sMt2},
            {null, null, sMt1, null, sMt2, null, sMt2, null, null},
            {sMt1, null, null, null, sMt2, null, null, null, null},
            {null, null, sMt1, null, sMt2, null, null, null, null},
            {sMt1, sMt2, null, null, null, null, null, null, null},
            {sMt2, sMt1, null, null, null, null, null, null, null},
            {sMt1, null, null, sMt2, null, null, null, null, null},
            {sMt2, null, null, sMt1, null, null, null, null, null},
            {sMt1, sMt1, sMt1, sMt1, sMt1, sMt1, null, sMt2, null},
            {sMt1, sMt1, null, sMt1, sMt1, sMt2, sMt1, sMt1, null},
            {null, sMt1, sMt1, sMt2, sMt1, sMt1, null, sMt1, sMt1},
            {null, sMt2, null, sMt1, sMt1, sMt1, sMt1, sMt1, sMt1},
            {sMt1, sMt1, sMt1, sMt1, sMt2, sMt1, null, sMt2, null},
            {sMt1, sMt1, null, sMt1, sMt2, sMt2, sMt1, sMt1, null},
            {null, sMt1, sMt1, sMt2, sMt2, sMt1, null, sMt1, sMt1},
            {null, sMt2, null, sMt1, sMt2, sMt1, sMt1, sMt1, sMt1},
            {sMt1, null, null, null, sMt1, null, null, null, null},
            {null, sMt1, null, sMt1, null, null, null, null, null},
            {sMt1, sMt1, null, sMt2, null, sMt1, sMt2, null, null},
            {null, sMt1, sMt1, sMt1, null, sMt2, null, null, sMt2}
    };
    private static final String[][] sShapesA = new String[][]{
            null,
            null,
            null,
            {"Helmet", s_P + s_P + s_P, s_P + s_H + s_P},
            {"ChestPlate", s_P + s_H + s_P, s_P + s_P + s_P, s_P + s_P + s_P},
            {"Pants", s_P + s_P + s_P, s_P + s_H + s_P, s_P + " " + s_P},
            {"Boots", s_P + " " + s_P, s_P + s_H + s_P},
            {"Sword", " " + s_P + " ", s_F + s_P + s_H, " " + s_R + " "},
            {"Pickaxe", s_P + s_I + s_I, s_F + s_R + s_H, " " + s_R + " "},
            {"Shovel", s_F + s_P + s_H, " " + s_R + " ", " " + s_R + " "},
            {"Axe", s_P + s_I + s_H, s_P + s_R + " ", s_F + s_R + " "},
            {"Axe", s_P + s_I + s_H, s_P + s_R + " ", s_F + s_R + " "},
            {"Hoe", s_P + s_I + s_H, s_F + s_R + " ", " " + s_R + " "},
            {"Hoe", s_P + s_I + s_H, s_F + s_R + " ", " " + s_R + " "},
            {"Sickle", " " + s_P + " ", s_P + s_F + " ", s_H + s_P + s_R},
            {"Sickle", " " + s_P + " ", s_P + s_F + " ", s_H + s_P + s_R},
            {"Sickle", " " + s_P + " ", s_P + s_F + " ", s_H + s_P + s_R},
            {"Sickle", " " + s_P + " ", s_P + s_F + " ", s_H + s_P + s_R},
            {"Sword", " " + s_R + " ", s_F + s_P + s_H, " " + s_P + " "},
            {"Pickaxe", " " + s_R + " ", s_F + s_R + s_H, s_P + s_I + s_I},
            {"Shovel", " " + s_R + " ", " " + s_R + " ", s_F + s_P + s_H},
            {"Axe", s_F + s_R + " ", s_P + s_R + " ", s_P + s_I + s_H},
            {"Axe", s_F + s_R + " ", s_P + s_R + " ", s_P + s_I + s_H},
            {"Hoe", " " + s_R + " ", s_F + s_R + " ", s_P + s_I + s_H},
            {"Hoe", " " + s_R + " ", s_F + s_R + " ", s_P + s_I + s_H},
            {"Spear", s_P + s_H + " ", s_F + s_R + " ", " " + " " + s_R},
            {"Spear", s_P + s_H + " ", s_F + s_R + " ", " " + " " + s_R},
            {"Knive", s_H + s_P, s_R + s_F},
            {"Knive", s_F + s_H, s_P + s_R},
            {"Knive", s_F + s_H, s_P + s_R},
            {"Knive", s_P + s_F, s_R + s_H},
            {"Knive", s_P + s_F, s_R + s_H},
            null,
            null,
            null,
            null,
            {"WarAxe", s_P + s_P + s_P, s_P + s_R + s_P, s_F + s_R + s_H},
            null,
            null,
            null,
            {"Shears", s_H + s_P, s_P + s_F},
            {"Shears", s_H + s_P, s_P + s_F},
            {"Scythe", s_I + s_P + s_H, s_R + s_F + s_P, s_R + " " + " "},
            {"Scythe", s_H + s_P + s_I, s_P + s_F + s_R, " " + " " + s_R}
    };
    public static volatile int VERSION = 508;

    public static void registerMaterialRecycling(ItemStack aStack, MaterialsOld aMaterial, long aMaterialAmount, MaterialStack aByproduct) {
        if (GT_Utility.isStackInvalid(aStack)) return;
        if (aByproduct != null) {
            aByproduct = aByproduct.clone();
            aByproduct.mAmount /= aStack.stackSize;
        }
        GT_OreDictUnificator.addItemData(GT_Utility.copyAmount(1, aStack), new ItemData(aMaterial, aMaterialAmount / aStack.stackSize, aByproduct));
    }

    public static void registerMaterialRecycling(ItemStack aStack, ItemData aData) {
        if (GT_Utility.isStackInvalid(aStack) || GT_Utility.areStacksEqual(new ItemStack(Items.blaze_rod), aStack) || aData == null || !aData.hasValidMaterialData() || aData.mMaterial.mAmount <= 0 || GT_Utility.getFluidForFilledItem(aStack, false) != null)
            return;
        registerReverseMacerating(GT_Utility.copyAmount(1, aStack), aData, aData.mPrefix == null);
        registerReverseSmelting(GT_Utility.copyAmount(1, aStack), aData.mMaterial.mMaterial, aData.mMaterial.mAmount, true);
        registerReverseFluidSmelting(GT_Utility.copyAmount(1, aStack), aData.mMaterial.mMaterial, aData.mMaterial.mAmount, aData.getByProduct(0));
        registerReverseArcSmelting(GT_Utility.copyAmount(1, aStack), aData);
    }

    /**
     * @param aStack          the stack to be recycled.
     * @param aMaterial       the Material.
     * @param aMaterialAmount the amount of it in Material Units.
     */
    public static void registerReverseFluidSmelting(ItemStack aStack, MaterialsOld aMaterial, long aMaterialAmount, MaterialStack aByproduct) {
        if (aStack == null || aMaterial == null || aMaterial.mSmeltInto.mStandardMoltenFluid == null || !aMaterial.contains(SubTag.SMELTING_TO_FLUID) || (FLUID_MATERIAL_UNIT * aMaterialAmount) / (MATERIAL_UNIT * aStack.stackSize) <= 0)
            return;
        RECIPE_ADDER_INSTANCE.addFluidSmelterRecipe(GT_Utility.copyAmount(1, aStack), aByproduct == null ? null : aByproduct.mMaterial.contains(SubTag.NO_SMELTING) || !aByproduct.mMaterial.contains(SubTag.METAL) ? aByproduct.mMaterial.contains(SubTag.FLAMMABLE) ? GT_OreDictUnificator.getDust(MaterialsOld.Ash, aByproduct.mAmount / 2) : aByproduct.mMaterial.contains(SubTag.UNBURNABLE) ? GT_OreDictUnificator.getDustOrIngot(aByproduct.mMaterial.mSmeltInto, aByproduct.mAmount) : null : GT_OreDictUnificator.getIngotOrDust(aByproduct.mMaterial.mSmeltInto, aByproduct.mAmount), aMaterial.mSmeltInto.getMolten((FLUID_MATERIAL_UNIT * aMaterialAmount) / (MATERIAL_UNIT * aStack.stackSize)), 10000, (int) Math.max(1, (24 * aMaterialAmount) / MATERIAL_UNIT), Math.max(8, (int) Math.sqrt(2 * aMaterial.mSmeltInto.mStandardMoltenFluid.getTemperature())));
    }

    /**
     * @param aStack             the stack to be recycled.
     * @param aMaterial          the Material.
     * @param aMaterialAmount    the amount of it in Material Units.
     * @param aAllowAlloySmelter if it is allowed to be recycled inside the Alloy Smelter.
     */
    public static void registerReverseSmelting(ItemStack aStack, MaterialsOld aMaterial, long aMaterialAmount, boolean aAllowAlloySmelter) {
        if (aStack == null || aMaterial == null || aMaterialAmount <= 0 || aMaterial.contains(SubTag.NO_SMELTING) || (aMaterialAmount > MATERIAL_UNIT && aMaterial.contains(SubTag.METAL)))
            return;
        aMaterialAmount /= aStack.stackSize;
        if(aMaterial== MaterialsOld.Naquadah||aMaterial== MaterialsOld.NaquadahEnriched)return;
        if (aAllowAlloySmelter)
            GT_ModHandler.addSmeltingAndAlloySmeltingRecipe(GT_Utility.copyAmount(1, aStack), GT_OreDictUnificator.getIngot(aMaterial.mSmeltInto, aMaterialAmount));
        else
            GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1, aStack), GT_OreDictUnificator.getIngot(aMaterial.mSmeltInto, aMaterialAmount));
    }

    public static void registerReverseArcSmelting(ItemStack aStack, MaterialsOld aMaterial, long aMaterialAmount, MaterialStack aByProduct01, MaterialStack aByProduct02, MaterialStack aByProduct03) {
        registerReverseArcSmelting(aStack, new ItemData(aMaterial == null ? null : new MaterialStack(aMaterial, aMaterialAmount), aByProduct01, aByProduct02, aByProduct03));
    }

    public static void registerReverseArcSmelting(ItemStack aStack, ItemData aData) {
        if (aStack == null || aData == null) return;
        aData = new ItemData(aData);

        if (!aData.hasValidMaterialData()) return;

        for (MaterialStack tMaterial : aData.getAllMaterialStacks()) {
            if (tMaterial.mMaterial.contains(SubTag.UNBURNABLE)) {
                tMaterial.mMaterial = tMaterial.mMaterial.mSmeltInto.mArcSmeltInto;
                continue;
            }
            if (tMaterial.mMaterial.contains(SubTag.EXPLOSIVE)) {
                tMaterial.mMaterial = MaterialsOld.Ash;
                tMaterial.mAmount /= 4;
                continue;
            }
            if (tMaterial.mMaterial.contains(SubTag.FLAMMABLE)) {
                tMaterial.mMaterial = MaterialsOld.Ash;
                tMaterial.mAmount /= 2;
                continue;
            }
            if (tMaterial.mMaterial.contains(SubTag.NO_SMELTING)) {
                tMaterial.mAmount = 0;
                continue;
            }
            if (tMaterial.mMaterial.contains(SubTag.METAL)) {
                tMaterial.mMaterial = tMaterial.mMaterial.mSmeltInto.mArcSmeltInto;
                continue;
            }
            tMaterial.mAmount = 0;
        }

        aData = new ItemData(aData);

        if (aData.mByProducts.length > 3) for (MaterialStack tMaterial : aData.getAllMaterialStacks())
            if (tMaterial.mMaterial == MaterialsOld.Ash) tMaterial.mAmount = 0;

        aData = new ItemData(aData);

        if (!aData.hasValidMaterialData()) return;

        long tAmount = 0;
        for (MaterialStack tMaterial : aData.getAllMaterialStacks())
            tAmount += tMaterial.mAmount * tMaterial.mMaterial.getMass();

        RECIPE_ADDER_INSTANCE.addArcFurnaceRecipe(aStack, new ItemStack[]{GT_OreDictUnificator.getIngotOrDust(aData.mMaterial), GT_OreDictUnificator.getIngotOrDust(aData.getByProduct(0)), GT_OreDictUnificator.getIngotOrDust(aData.getByProduct(1)), GT_OreDictUnificator.getIngotOrDust(aData.getByProduct(2))}, null, (int) Math.max(16, tAmount / MATERIAL_UNIT), 96);
    }

    public static void registerReverseMacerating(ItemStack aStack, MaterialsOld aMaterial, long aMaterialAmount, MaterialStack aByProduct01, MaterialStack aByProduct02, MaterialStack aByProduct03, boolean aAllowHammer) {
        registerReverseMacerating(aStack, new ItemData(aMaterial == null ? null : new MaterialStack(aMaterial, aMaterialAmount), aByProduct01, aByProduct02, aByProduct03), aAllowHammer);
    }

    public static void registerReverseMacerating(ItemStack aStack, ItemData aData, boolean aAllowHammer) {
        if (aStack == null || aData == null) return;
        aData = new ItemData(aData);

        if (!aData.hasValidMaterialData()) return;

        for (MaterialStack tMaterial : aData.getAllMaterialStacks())
            tMaterial.mMaterial = tMaterial.mMaterial.mMacerateInto;

        aData = new ItemData(aData);

        if (!aData.hasValidMaterialData()) return;

        long tAmount = 0;
        for (MaterialStack tMaterial : aData.getAllMaterialStacks())
            tAmount += tMaterial.mAmount * tMaterial.mMaterial.getMass();

        RECIPE_ADDER_INSTANCE.addPulveriserRecipe(aStack, new ItemStack[]{GT_OreDictUnificator.getDust(aData.mMaterial), GT_OreDictUnificator.getDust(aData.getByProduct(0)), GT_OreDictUnificator.getDust(aData.getByProduct(1)), GT_OreDictUnificator.getDust(aData.getByProduct(2))}, null, (int) Math.max(16, tAmount / MATERIAL_UNIT), 4);

        if (aAllowHammer) for (MaterialStack tMaterial : aData.getAllMaterialStacks())
            if (tMaterial.mMaterial.contains(SubTag.CRYSTAL) && !tMaterial.mMaterial.contains(SubTag.METAL)) {
            	if (RECIPE_ADDER_INSTANCE.addForgeHammerRecipe(GT_Utility.copyAmount(1, aStack), GT_OreDictUnificator.getDust(aData.mMaterial), 200, 32))
                    break;
            }
        ItemStack tDust = GT_OreDictUnificator.getDust(aData.mMaterial);
        if (tDust != null && GT_ModHandler.addPulverisationRecipe(GT_Utility.copyAmount(1, aStack), tDust, GT_OreDictUnificator.getDust(aData.getByProduct(0)), 100, GT_OreDictUnificator.getDust(aData.getByProduct(1)), 100, true)) {
            if (GregTech_API.sThaumcraftCompat != null)
                GregTech_API.sThaumcraftCompat.addCrucibleRecipe(IThaumcraftCompat.ADVANCEDENTROPICPROCESSING, aStack, tDust, Arrays.asList(new TC_AspectStack(TC_Aspects.PERDITIO, Math.max(1, (aData.mMaterial.mAmount * 2) / MATERIAL_UNIT))));
        }
    }

    /**
     * You give this Function a Material and it will scan almost everything for adding recycling Recipes
     *
     * @param aMat             a Material, for example an Ingot or a Gem.
     * @param aOutput          the Dust you usually get from macerating aMat
     * @param aRecipeReplacing allows to replace the Recipe with a Plate variant
     */
    public static synchronized void registerUsagesForMaterials(ItemStack aMat, String aPlate, boolean aRecipeReplacing) {
        if (aMat == null) return;
        aMat = GT_Utility.copy(aMat);
        ItemStack tStack;
        ItemData aItemData = GT_OreDictUnificator.getItemData(aMat);
        if (aItemData == null || aItemData.mPrefix != OrePrefixes.ingot) aPlate = null;
        if (aPlate != null && GT_OreDictUnificator.getFirstOre(aPlate, 1) == null) aPlate = null;

        sMt1.func_150996_a(aMat.getItem());
        sMt1.stackSize = 1;
        Items.feather.setDamage(sMt1, Items.feather.getDamage(aMat));

        sMt2.func_150996_a(new ItemStack(Blocks.dirt).getItem());
        sMt2.stackSize = 1;
        Items.feather.setDamage(sMt2, 0);

        for (ItemStack[] tRecipe : sShapes1) {
            int tAmount1 = 0;
            for (ItemStack tMat : tRecipe) {
                if (tMat == sMt1) tAmount1++;
            }
            if (aItemData != null && aItemData.hasValidPrefixMaterialData())
                for (ItemStack tCrafted : GT_ModHandler.getRecipeOutputs(tRecipe)) {
                    GT_OreDictUnificator.addItemData(tCrafted, new ItemData(aItemData.mMaterial.mMaterial, aItemData.mMaterial.mAmount * tAmount1));
                }
        }

        for (MaterialsOld tMaterial : sRodMaterialList) {
            ItemStack tMt2 = GT_OreDictUnificator.get(OrePrefixes.stick, tMaterial, 1);
            if (tMt2 != null) {
                sMt2.func_150996_a(tMt2.getItem());
                sMt2.stackSize = 1;
                Items.feather.setDamage(sMt2, Items.feather.getDamage(tMt2));

                for (int i = 0; i < sShapes1.length; i++) {
                    ItemStack[] tRecipe = sShapes1[i];

                    int tAmount1 = 0, tAmount2 = 0;
                    for (ItemStack tMat : tRecipe) {
                        if (tMat == sMt1) tAmount1++;
                        if (tMat == sMt2) tAmount2++;
                    }
                    for (ItemStack tCrafted : GT_ModHandler.getVanillyToolRecipeOutputs(tRecipe)) {
                        if (aItemData != null && aItemData.hasValidPrefixMaterialData())
                            GT_OreDictUnificator.addItemData(tCrafted, new ItemData(aItemData.mMaterial.mMaterial, aItemData.mMaterial.mAmount * tAmount1, new MaterialStack(tMaterial, OrePrefixes.stick.mMaterialAmount * tAmount2)));

                        if (aRecipeReplacing && aPlate != null && sShapesA[i] != null && sShapesA[i].length > 1) {
                            assert aItemData != null;
                            if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, aItemData.mMaterial.mMaterial + "." + sShapesA[i][0], true)) {
                                if (null != (tStack = GT_ModHandler.removeRecipe(tRecipe))) {
                                    switch (sShapesA[i].length) {
                                        case 2:
                                            GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.BUFFERED, new Object[]{sShapesA[i][1], s_P.charAt(0), aPlate, s_R.charAt(0), OrePrefixes.stick.get(tMaterial), s_I.charAt(0), aItemData});
                                            break;
                                        case 3:
                                            GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.BUFFERED, new Object[]{sShapesA[i][1], sShapesA[i][2], s_P.charAt(0), aPlate, s_R.charAt(0), OrePrefixes.stick.get(tMaterial), s_I.charAt(0), aItemData});
                                            break;
                                        default:
                                            GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.BUFFERED, new Object[]{sShapesA[i][1], sShapesA[i][2], sShapesA[i][3], s_P.charAt(0), aPlate, s_R.charAt(0), OrePrefixes.stick.get(tMaterial), s_I.charAt(0), aItemData});
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
