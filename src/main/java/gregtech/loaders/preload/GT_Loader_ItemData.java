package gregtech.loaders.preload;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.MaterialsOld;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.objects.ItemData;
import gregtech.api.objects.MaterialStack;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static gregtech.api.enums.GT_Values.MATERIAL_UNIT;
import static gregtech.api.enums.GT_Values.MOD_ID_AE;
import static gregtech.api.enums.GT_Values.MOD_ID_FR;
import static gregtech.api.enums.GT_Values.MOD_ID_RC;
import static gregtech.api.enums.GT_Values.MOD_ID_TC;
import static gregtech.api.enums.GT_Values.MOD_ID_TF;

public class GT_Loader_ItemData
        implements Runnable {
    public void run() {
        GT_Log.out.println("GT_Mod: Loading Item Data Tags");
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "item.giantPick", 1L, 0), new ItemData(MaterialsOld.Stone, 696729600L, new MaterialStack(MaterialsOld.Wood, 464486400L)));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "item.giantSword", 1L, 0), new ItemData(MaterialsOld.Stone, 464486400L, new MaterialStack(MaterialsOld.Wood, 232243200L)));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "tile.GiantLog", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 232243200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "tile.GiantCobble", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 232243200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "tile.GiantObsidian", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Obsidian, 232243200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "item.minotaurAxe", 1L, 0), new ItemData(MaterialsOld.Diamond, 14515200L, new MaterialStack(MaterialsOld.Wood, OrePrefixes.stick.mMaterialAmount * 2L)));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "item.armorShards", 1L, 0), new ItemData(MaterialsOld.Knightmetal, 403200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TF, "item.shardCluster", 1L, 0), new ItemData(MaterialsOld.Knightmetal, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(ItemList.TF_LiveRoot.get(1L), new ItemData(MaterialsOld.LiveRoot, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "item.ItemMultiMaterial", 1L, 10), new ItemData(MaterialsOld.CertusQuartz, 1814400L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "item.ItemMultiMaterial", 1L, 11), new ItemData(MaterialsOld.NetherQuartz, 1814400L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "item.ItemMultiMaterial", 1L, 12), new ItemData(MaterialsOld.Fluix, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.quartz_block, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.NetherQuartz, 14515200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "tile.BlockQuartz", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.CertusQuartz, 14515200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "tile.BlockQuartzPillar", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.CertusQuartz, 14515200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_AE, "tile.BlockQuartzChiseled", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.CertusQuartz, 14515200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.wheat, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wheat, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.hay_block, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wheat, 32659200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.snowball, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Snow, 907200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.snow, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Snow, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glowstone, 14515200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.redstone_lamp, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glowstone, 14515200L, new MaterialStack(MaterialsOld.Redstone, OrePrefixes.dust.mMaterialAmount * 4L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.lit_redstone_lamp, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glowstone, 14515200L, new MaterialStack(MaterialsOld.Redstone, OrePrefixes.dust.mMaterialAmount * 4L)));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_FR, "craftingMaterial", 1L, 5), new ItemData(MaterialsOld.Ice, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.ice, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Ice, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.packed_ice, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Ice, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.clay_ball, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Clay, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.clay, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Clay, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.hardened_clay, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Clay, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stained_hardened_clay, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Clay, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.brick_block, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Clay, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("Uran238", 1L), new ItemData(MaterialsOld.Uranium, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("Uran235", 1L), new ItemData(MaterialsOld.Uranium235, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("Plutonium", 1L), new ItemData(MaterialsOld.Plutonium, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("smallUran235", 1L), new ItemData(MaterialsOld.Uranium235, 403200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("smallPlutonium", 1L), new ItemData(MaterialsOld.Plutonium, 403200L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Iron.get(1L), new ItemData(MaterialsOld.Iron, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Gold.get(1L), new ItemData(MaterialsOld.Gold, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Bronze.get(1L), new ItemData(MaterialsOld.Bronze, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Copper.get(1L), new ItemData(MaterialsOld.Copper, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Tin.get(1L), new ItemData(MaterialsOld.Tin, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Lead.get(1L), new ItemData(MaterialsOld.Lead, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Item_Casing_Steel.get(1L), new ItemData(MaterialsOld.Steel, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.book, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Paper, 10886400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.written_book, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Paper, 10886400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.writable_book, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Paper, 10886400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.enchanted_book, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Paper, 10886400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.golden_apple, 1, 1), new ItemData(MaterialsOld.Gold, OrePrefixes.block.mMaterialAmount * 8L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.golden_apple, 1, 0), new ItemData(MaterialsOld.Gold, OrePrefixes.ingot.mMaterialAmount * 8L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.golden_carrot, 1, 0), new ItemData(MaterialsOld.Gold, OrePrefixes.nugget.mMaterialAmount * 8L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.speckled_melon, 1, 0), new ItemData(MaterialsOld.Gold, OrePrefixes.nugget.mMaterialAmount * 8L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.minecart, 1), new ItemData(MaterialsOld.Iron, 18144000L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.iron_door, 1), new ItemData(MaterialsOld.Iron, 21772800L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.cauldron, 1), new ItemData(MaterialsOld.Iron, 25401600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.iron_bars, 8, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, 10886400L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getIC2Item("ironFurnace", 1L), new ItemData(MaterialsOld.Iron, 18144000L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Food_Can_Empty.get(1L), new ItemData(MaterialsOld.Tin, 1814400L));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Fuel_Rod_Empty.get(1L), new ItemData(MaterialsOld.Iron, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(ItemList.IC2_Fuel_Can_Empty.get(1L), new ItemData(MaterialsOld.Tin, 25401600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.light_weighted_pressure_plate, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Gold, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.heavy_weighted_pressure_plate, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, 7257600L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_RC, "tile.railcraft.anvil", 1L, 0), new ItemData(MaterialsOld.Steel, 108864000L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_RC, "tile.railcraft.anvil", 1L, 1), new ItemData(MaterialsOld.Steel, 72576000L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_RC, "tile.railcraft.anvil", 1L, 2), new ItemData(MaterialsOld.Steel, 36288000L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.anvil, 1, 0), new ItemData(MaterialsOld.Iron, 108864000L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.anvil, 1, 1), new ItemData(MaterialsOld.Iron, 72576000L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.anvil, 1, 2), new ItemData(MaterialsOld.Iron, 36288000L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.hopper, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, 18144000L, new MaterialStack(MaterialsOld.Wood, 29030400L)));
        GT_OreDictUnificator.addItemData(ItemList.Cell_Universal_Fluid.get(1L), new ItemData(MaterialsOld.Tin, 7257600L, new MaterialStack(MaterialsOld.Glass, 1360800L)));
        GT_OreDictUnificator.addItemData(ItemList.Cell_Empty.get(1L), new ItemData(MaterialsOld.Tin, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.tripwire_hook, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, OrePrefixes.ring.mMaterialAmount * 2L, new MaterialStack(MaterialsOld.Wood, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(ItemList.Bottle_Empty.get(1L), new ItemData(MaterialsOld.Glass, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.potionitem, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glass, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stained_glass, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glass, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.glass, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glass, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stained_glass_pane, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glass, 1360800L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.glass_pane, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Glass, 1360800L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.clock, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Gold, 14515200L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.compass, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, 14515200L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.iron_horse_armor, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Iron, 29030400L, new MaterialStack(MaterialsOld.Leather, 21772800L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.golden_horse_armor, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Gold, 29030400L, new MaterialStack(MaterialsOld.Leather, 21772800L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.diamond_horse_armor, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Diamond, 29030400L, new MaterialStack(MaterialsOld.Leather, 21772800L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.leather, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Leather, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.beacon, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.NetherStar, MATERIAL_UNIT, new MaterialStack(MaterialsOld.Obsidian, 10886400L), new MaterialStack(MaterialsOld.Glass, 18144000L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.enchanting_table, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Diamond, 7257600L, new MaterialStack(MaterialsOld.Obsidian, 14515200L), new MaterialStack(MaterialsOld.Paper, 10886400L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.ender_chest, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.EnderEye, MATERIAL_UNIT, new MaterialStack(MaterialsOld.Obsidian, 29030400L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.bookshelf, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Paper, 32659200L, new MaterialStack(MaterialsOld.Wood, 21772800L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.lever, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT, new MaterialStack(MaterialsOld.Wood, 1814400L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.ice, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Ice, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.packed_ice, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Ice, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.snow, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Snow, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.snowball, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Snow, 907200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.snow_layer, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Snow, -1L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.sand, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Sand, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.sandstone, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Sand, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 0), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 8), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 0), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 8), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 1), new ItemData(MaterialsOld.Sand, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 9), new ItemData(MaterialsOld.Sand, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 1), new ItemData(MaterialsOld.Sand, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 9), new ItemData(MaterialsOld.Sand, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 2), new ItemData(MaterialsOld.Wood, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 10), new ItemData(MaterialsOld.Wood, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 2), new ItemData(MaterialsOld.Wood, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 10), new ItemData(MaterialsOld.Wood, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 3), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 11), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 3), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 11), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 5), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_slab, 1, 13), new ItemData(MaterialsOld.Stone, 1814400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 5), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.double_stone_slab, 1, 13), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.furnace, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 29030400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.lit_furnace, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 29030400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stonebrick, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.cobblestone, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.mossy_cobblestone, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_button, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.stone_pressure_plate, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.ladder, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.wooden_button, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.wooden_pressure_plate, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.fence, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 5443200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.bowl, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, MATERIAL_UNIT));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.sign, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 7257600L));
        GT_OreDictUnificator.addItemData(new ItemStack(Items.wooden_door, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 21772800L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.chest, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 29030400L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.trapped_chest, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 32659200L, new MaterialStack(MaterialsOld.Iron, OrePrefixes.ring.mMaterialAmount * 2L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.unlit_redstone_torch, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 1814400L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.redstone_torch, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 1814400L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.noteblock, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 29030400L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.jukebox, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 29030400L, new MaterialStack(MaterialsOld.Diamond, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.crafting_table, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Wood, 14515200L));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.piston, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 14515200L, new MaterialStack(MaterialsOld.Wood, 10886400L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.sticky_piston, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 14515200L, new MaterialStack(MaterialsOld.Wood, 10886400L)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.dispenser, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 25401600L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(new ItemStack(Blocks.dropper, 1, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.Stone, 25401600L, new MaterialStack(MaterialsOld.Redstone, MATERIAL_UNIT)));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TC, "ItemNuggetChicken", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.MeatCooked, 403200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TC, "ItemNuggetBeef", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.MeatCooked, 403200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TC, "ItemNuggetPork", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.MeatCooked, 403200L));
        GT_OreDictUnificator.addItemData(GT_ModHandler.getModItem(MOD_ID_TC, "ItemNuggetFish", 1L, OreDictionary.WILDCARD_VALUE), new ItemData(MaterialsOld.MeatCooked, 403200L));
        for (ItemStack tItem : new ItemStack[]{GT_ModHandler.getModItem(MOD_ID_TF, "item.meefRaw", 1L, 0), GT_ModHandler.getModItem(MOD_ID_TF, "item.venisonRaw", 1L, 0), new ItemStack(Items.porkchop), new ItemStack(Items.beef), new ItemStack(Items.chicken), new ItemStack(Items.fish)}) {
            if (tItem != null) {
                GT_OreDictUnificator.addItemData(GT_Utility.copyMetaData(OreDictionary.WILDCARD_VALUE, tItem), new ItemData(MaterialsOld.MeatRaw, MATERIAL_UNIT, new MaterialStack(MaterialsOld.Bone, 403200L)));
            }
        }
        for (ItemStack tItem : new ItemStack[]{GT_ModHandler.getModItem(MOD_ID_TF, "item.meefSteak", 1L, 0), GT_ModHandler.getModItem(MOD_ID_TF, "item.venisonCooked", 1L, 0), new ItemStack(Items.cooked_porkchop), new ItemStack(Items.cooked_beef), new ItemStack(Items.cooked_chicken), new ItemStack(Items.cooked_fished)}) {
            if (tItem != null) {
                GT_OreDictUnificator.addItemData(GT_Utility.copyMetaData(OreDictionary.WILDCARD_VALUE, tItem), new ItemData(MaterialsOld.MeatCooked, MATERIAL_UNIT, new MaterialStack(MaterialsOld.Bone, 403200L)));
            }
        }
    }
}
