package gregtech.loaders.postload;

import gregtech.GT_Mod;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.MaterialsOld;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_ScrapboxDropLoader
        implements Runnable {
    public void run() {
        GT_Log.out.println("GT_Mod: (re-)adding Scrapbox Drops.");

        GT_ModHandler.addScrapboxDrop(9.5F, new ItemStack(Items.wooden_hoe));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Items.wooden_axe));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Items.wooden_sword));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Items.wooden_shovel));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Items.wooden_pickaxe));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Items.sign));
        GT_ModHandler.addScrapboxDrop(9.5F, new ItemStack(Items.stick));
        GT_ModHandler.addScrapboxDrop(5.0F, new ItemStack(Blocks.dirt));
        GT_ModHandler.addScrapboxDrop(3.0F, new ItemStack(Blocks.grass));
        GT_ModHandler.addScrapboxDrop(3.0F, new ItemStack(Blocks.gravel));
        GT_ModHandler.addScrapboxDrop(0.5F, new ItemStack(Blocks.pumpkin));
        GT_ModHandler.addScrapboxDrop(1.0F, new ItemStack(Blocks.soul_sand));
        GT_ModHandler.addScrapboxDrop(2.0F, new ItemStack(Blocks.netherrack));
        GT_ModHandler.addScrapboxDrop(1.0F, new ItemStack(Items.bone));
        GT_ModHandler.addScrapboxDrop(9.0F, new ItemStack(Items.rotten_flesh));
        GT_ModHandler.addScrapboxDrop(0.4F, new ItemStack(Items.cooked_porkchop));
        GT_ModHandler.addScrapboxDrop(0.4F, new ItemStack(Items.cooked_beef));
        GT_ModHandler.addScrapboxDrop(0.4F, new ItemStack(Items.cooked_chicken));
        GT_ModHandler.addScrapboxDrop(0.5F, new ItemStack(Items.apple));
        GT_ModHandler.addScrapboxDrop(0.5F, new ItemStack(Items.bread));
        GT_ModHandler.addScrapboxDrop(0.1F, new ItemStack(Items.cake));
        GT_ModHandler.addScrapboxDrop(1.0F, ItemList.IC2_Food_Can_Filled.get(1L));
        GT_ModHandler.addScrapboxDrop(2.0F, ItemList.IC2_Food_Can_Spoiled.get(1L));
        GT_ModHandler.addScrapboxDrop(0.2F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Silicon, 1L));
        GT_ModHandler.addScrapboxDrop(1.0F, GT_OreDictUnificator.get(OrePrefixes.cell, MaterialsOld.Water, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, ItemList.Cell_Empty.get(1L));
        GT_ModHandler.addScrapboxDrop(5.0F, GT_OreDictUnificator.get(OrePrefixes.plate, MaterialsOld.Paper, 1L));
        GT_ModHandler.addScrapboxDrop(1.0F, new ItemStack(Items.leather));
        GT_ModHandler.addScrapboxDrop(1.0F, new ItemStack(Items.feather));
        GT_ModHandler.addScrapboxDrop(0.7F, GT_ModHandler.getIC2Item("plantBall", 1L));
        GT_ModHandler.addScrapboxDrop(3.8F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Wood, 1L));
        GT_ModHandler.addScrapboxDrop(0.6F, new ItemStack(Items.slime_ball));
        GT_ModHandler.addScrapboxDrop(0.8F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Rubber, 1L));
        GT_ModHandler.addScrapboxDrop(2.7F, GT_ModHandler.getIC2Item("suBattery", 1L));
        GT_ModHandler.addScrapboxDrop(3.6F, ItemList.Circuit_Primitive.get(1L));
        GT_ModHandler.addScrapboxDrop(0.8F, ItemList.Circuit_Parts_Advanced.get(1L));
        GT_ModHandler.addScrapboxDrop(1.8F, ItemList.Circuit_Board_Basic.get(1L));
        GT_ModHandler.addScrapboxDrop(0.4F, ItemList.Circuit_Board_Advanced.get(1L));
        GT_ModHandler.addScrapboxDrop(0.2F, ItemList.Circuit_Board_Elite.get(1L));
        if (!GT_Mod.gregtechproxy.mDisableIC2Cables) {
            GT_ModHandler.addScrapboxDrop(2.0F, GT_ModHandler.getIC2Item("insulatedCopperCableItem", 1L));
            GT_ModHandler.addScrapboxDrop(0.4F, GT_ModHandler.getIC2Item("insulatedGoldCableItem", 1L));
        }
        GT_ModHandler.addScrapboxDrop(0.9F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Redstone, 1L));
        GT_ModHandler.addScrapboxDrop(0.8F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Glowstone, 1L));
        GT_ModHandler.addScrapboxDrop(0.8F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Coal, 1L));
        GT_ModHandler.addScrapboxDrop(2.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Charcoal, 1L));
        GT_ModHandler.addScrapboxDrop(1.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Iron, 1L));
        GT_ModHandler.addScrapboxDrop(1.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Gold, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Silver, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Electrum, 1L));
        GT_ModHandler.addScrapboxDrop(1.2F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Tin, 1L));
        GT_ModHandler.addScrapboxDrop(1.2F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Copper, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Bauxite, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Aluminium, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Lead, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Nickel, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Zinc, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Brass, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Steel, 1L));
        GT_ModHandler.addScrapboxDrop(1.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Obsidian, 1L));
        GT_ModHandler.addScrapboxDrop(1.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Sulfur, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Saltpeter, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Lazurite, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Pyrite, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Calcite, 1L));
        GT_ModHandler.addScrapboxDrop(2.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Sodalite, 1L));
        GT_ModHandler.addScrapboxDrop(4.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Netherrack, 1L));
        GT_ModHandler.addScrapboxDrop(4.0F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Flint, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Platinum, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Tungsten, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Chrome, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Titanium, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Magnesium, 1L));
        GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.Endstone, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.GarnetRed, 1L));
        GT_ModHandler.addScrapboxDrop(0.5F, GT_OreDictUnificator.get(OrePrefixes.dust, MaterialsOld.GarnetYellow, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.Olivine, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.Ruby, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.Sapphire, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.GreenSapphire, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.Emerald, 1L));
        GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get(OrePrefixes.gem, MaterialsOld.Diamond, 1L));
    }
}
