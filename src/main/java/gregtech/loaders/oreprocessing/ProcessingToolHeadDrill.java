package gregtech.loaders.oreprocessing;

import gregtech.api.enums.ItemList;
import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import gregtech.common.items.GT_MetaGenerated_Tool_01;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.NULL_ITEM_STACK;
import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingToolHeadDrill implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingToolHeadDrill() {
        OrePrefixes.toolHeadDrill.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{100000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_LV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("StainlessSteel")), 'P', OrePrefixes.plate.get(Materials.get("StainlessSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("StainlessSteel")), 'B', ItemList.Battery_RE_LV_Lithium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{75000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_LV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("StainlessSteel")), 'P', OrePrefixes.plate.get(Materials.get("StainlessSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("StainlessSteel")), 'B', ItemList.Battery_RE_LV_Cadmium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{50000L, 32L, 1L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_LV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("StainlessSteel")), 'P', OrePrefixes.plate.get(Materials.get("StainlessSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("StainlessSteel")), 'B', ItemList.Battery_RE_LV_Sodium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{400000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_MV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_MV_Lithium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{300000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_MV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_MV_Cadmium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{200000L, 128L, 2L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_MV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_MV_Sodium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{1600000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("TungstenSteel")), 'P', OrePrefixes.plate.get(Materials.get("TungstenSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("TungstenSteel")), 'B', ItemList.Battery_RE_HV_Lithium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{1200000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("TungstenSteel")), 'P', OrePrefixes.plate.get(Materials.get("TungstenSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("TungstenSteel")), 'B', ItemList.Battery_RE_HV_Cadmium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{800000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "GMG", "PBP", 'X', aOreDictName, 'M', ItemList.Electric_Motor_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("TungstenSteel")), 'P', OrePrefixes.plate.get(Materials.get("TungstenSteel")), 'G', OrePrefixes.gearGtSmall.get(Materials.get("TungstenSteel")), 'B', ItemList.Battery_RE_HV_Sodium.get(1L)});

        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.get("Titanium"), new long[]{1600000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", 'X', OrePrefixes.stickLong.get(aMaterial), 'M', ItemList.Electric_Piston_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'R', OrePrefixes.spring.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_HV_Lithium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.get("Titanium"), new long[]{1200000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", 'X', OrePrefixes.stickLong.get(aMaterial), 'M', ItemList.Electric_Piston_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'R', OrePrefixes.spring.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_HV_Cadmium.get(1L)});
        GT_ModHandler.addCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(130, 1, aMaterial, Materials.get("Titanium"), new long[]{800000L, 512L, 3L, -1L}), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SXd", "PRP", "MPB", 'X', OrePrefixes.stickLong.get(aMaterial), 'M', ItemList.Electric_Piston_HV.get(1L), 'S', OrePrefixes.screw.get(Materials.get("Titanium")), 'P', OrePrefixes.plate.get(Materials.get("Titanium")), 'R', OrePrefixes.spring.get(Materials.get("Titanium")), 'B', ItemList.Battery_RE_HV_Sodium.get(1L)});

        /*Recipes in factory to repair tools - e99999 */

        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_LV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Lithium"), 2L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{100000L, 32L, 1L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_LV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Cadmium"), 2L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{75000L, 32L, 1L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_LV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Sodium"), 2L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(100, 1, aMaterial, Materials.get("StainlessSteel"), new long[]{50000L, 32L, 1L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_MV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Lithium"), 8L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{400000L, 128L, 2L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_MV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Cadmium"), 8L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{30000L, 128L, 2L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_MV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Sodium"), 8L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(102, 1, aMaterial, Materials.get("Titanium"), new long[]{200000L, 128L, 2L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_HV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Lithium"), 32L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{1600000L, 512L, 3L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_HV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Cadmium"), 32L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{1200000L, 512L, 3L, -1L}), 100, 16);
        RECIPE_ADDER_INSTANCE.addPartFactoryRecipe(ItemList.ToolHull_HV.get(1), (GT_Utility.copyAmount(1, aStack)), NULL_ITEM_STACK , GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Sodium"), 32L), NULL_ITEM_STACK, NULL_ITEM_STACK, GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(104, 1, aMaterial, Materials.get("TungstenSteel"), new long[]{800000L, 512L, 3L, -1L}), 100, 16);
    }
}
