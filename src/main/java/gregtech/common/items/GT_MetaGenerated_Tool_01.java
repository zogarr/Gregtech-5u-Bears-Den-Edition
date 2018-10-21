package gregtech.common.items;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ConfigCategories;
import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TC_Aspects;
import gregtech.api.enums.ToolDictNames;
import gregtech.api.items.GT_MetaGenerated_Tool;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.tools.GT_Tool_Axe;
import gregtech.common.tools.GT_Tool_BranchCutter;
import gregtech.common.tools.GT_Tool_ButcheryKnife;
import gregtech.common.tools.GT_Tool_BuzzSaw;
import gregtech.common.tools.GT_Tool_Chainsaw_HV;
import gregtech.common.tools.GT_Tool_Chainsaw_LV;
import gregtech.common.tools.GT_Tool_Chainsaw_MV;
import gregtech.common.tools.GT_Tool_Crowbar;
import gregtech.common.tools.GT_Tool_Drill_HV;
import gregtech.common.tools.GT_Tool_Drill_LV;
import gregtech.common.tools.GT_Tool_Drill_MV;
import gregtech.common.tools.GT_Tool_File;
import gregtech.common.tools.GT_Tool_HardHammer;
import gregtech.common.tools.GT_Tool_Hoe;
import gregtech.common.tools.GT_Tool_JackHammer;
import gregtech.common.tools.GT_Tool_Knife;
import gregtech.common.tools.GT_Tool_Mortar;
import gregtech.common.tools.GT_Tool_Multi;
import gregtech.common.tools.GT_Tool_Pickaxe;
import gregtech.common.tools.GT_Tool_Plow;
import gregtech.common.tools.GT_Tool_Plunger;
import gregtech.common.tools.GT_Tool_RollingPin;
import gregtech.common.tools.GT_Tool_Saw;
import gregtech.common.tools.GT_Tool_Scoop;
import gregtech.common.tools.GT_Tool_Screwdriver;
import gregtech.common.tools.GT_Tool_Screwdriver_LV;
import gregtech.common.tools.GT_Tool_Sense;
import gregtech.common.tools.GT_Tool_Shovel;
import gregtech.common.tools.GT_Tool_SoftHammer;
import gregtech.common.tools.GT_Tool_Soldering_Iron;
import gregtech.common.tools.GT_Tool_Sword;
import gregtech.common.tools.GT_Tool_Turbine_Huge;
import gregtech.common.tools.GT_Tool_Turbine_Large;
import gregtech.common.tools.GT_Tool_Turbine_Normal;
import gregtech.common.tools.GT_Tool_Turbine_Small;
import gregtech.common.tools.GT_Tool_UniversalSpade;
import gregtech.common.tools.GT_Tool_WireCutter;
import gregtech.common.tools.GT_Tool_Wrench;
import gregtech.common.tools.GT_Tool_Wrench_HV;
import gregtech.common.tools.GT_Tool_Wrench_LV;
import gregtech.common.tools.GT_Tool_Wrench_MV;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.EMPTY_STRING;

public class GT_MetaGenerated_Tool_01 extends GT_MetaGenerated_Tool {
    public static final short SWORD = 0;
    public static final short PICKAXE = 2;
    public static final short SHOVEL = 4;
    public static final short AXE = 6;
    public static final short HOE = 8;
    public static final short SAW = 10;
    public static final short HARDHAMMER = 12;
    public static final short SOFTHAMMER = 14;
    public static final short WRENCH = 16;
    public static final short FILE = 18;
    public static final short CROWBAR = 20;
    public static final short SCREWDRIVER = 22;
    public static final short MORTAR = 24;
    public static final short WIRECUTTER = 26;
    public static final short SCOOP = 28;
    public static final short BRANCHCUTTER = 30;
    public static final short UNIVERSALSPADE = 32;
    public static final short KNIFE = 34;
    public static final short BUTCHERYKNIFE = 36;
    public static final short SICKLE = 38;
    public static final short SENSE = 40;
    public static final short PLOW = 42;
    public static final short PLUNGER = 44;
    public static final short ROLLING_PIN = 46;
    public static final short DRILL_LV = 100;
    public static final short DRILL_MV = 102;
    public static final short DRILL_HV = 104;
    public static final short CHAINSAW_LV = 110;
    public static final short CHAINSAW_MV = 112;
    public static final short CHAINSAW_HV = 114;
    public static final short WRENCH_LV = 120;
    public static final short WRENCH_MV = 122;
    public static final short WRENCH_HV = 124;
    public static final short JACKHAMMER = 130;
    public static final short BUZZSAW = 140;
    public static final short SCREWDRIVER_LV = 150;
    public static final short SOLDERING_IRON_LV = 160;
    public static final short TURBINE_SMALL = 170;
    public static final short TURBINE = 172;
    public static final short TURBINE_LARGE = 174;
    public static final short TURBINE_HUGE = 176;
    public static final short TURBINE_BLADE = 178;
    public static GT_MetaGenerated_Tool_01 INSTANCE;

    public GT_MetaGenerated_Tool_01() {
        super("metatool.01");
        INSTANCE = this;
        addTool(0, "Sword", EMPTY_STRING, new GT_Tool_Sword(), ToolDictNames.craftingToolSword, ToolDictNames.craftingToolBlade, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.TELUM, 4L));
        addTool(2, "Pickaxe", EMPTY_STRING, new GT_Tool_Pickaxe(), ToolDictNames.craftingToolPickaxe, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 4L));
        addTool(4, "Shovel", EMPTY_STRING, new GT_Tool_Shovel(), ToolDictNames.craftingToolShovel, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 4L));
        addTool(6, "Axe", EMPTY_STRING, new GT_Tool_Axe(), ToolDictNames.craftingToolAxe, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        addTool(8, "Hoe", EMPTY_STRING, new GT_Tool_Hoe(), ToolDictNames.craftingToolHoe, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.MESSIS, 4L));
        addTool(10, "Saw", "Can also harvest Ice", new GT_Tool_Saw(), ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        GregTech_API.registerTool(addTool(12, "Hammer", "Crushes Ores instead of harvesting them", new GT_Tool_HardHammer(), ToolDictNames.craftingToolHardHammer, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sHardHammerList);
        GregTech_API.registerTool(addTool(14, "Soft Mallet", EMPTY_STRING, new GT_Tool_SoftHammer(), ToolDictNames.craftingToolSoftMallet, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.LIMUS, 4L)), GregTech_API.sSoftHammerList);
        GregTech_API.registerTool(addTool(WRENCH, "Wrench", "Hold Leftclick to dismantle Machines", new GT_Tool_Wrench(), ToolDictNames.craftingToolWrench, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sWrenchList);
        addTool(18, "File", EMPTY_STRING, new GT_Tool_File(), ToolDictNames.craftingToolFile, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L));
        GregTech_API.registerTool(addTool(20, "Crowbar", "Dismounts Covers and Rotates Rails", new GT_Tool_Crowbar(), ToolDictNames.craftingToolCrowbar, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.TELUM, 2L)), GregTech_API.sCrowbarList);
        GregTech_API.registerTool(addTool(22, "Screwdriver", "Adjusts Covers and Machines", new GT_Tool_Screwdriver(), ToolDictNames.craftingToolScrewdriver, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sScrewdriverList);
        addTool(24, "Mortar", EMPTY_STRING, new GT_Tool_Mortar(), ToolDictNames.craftingToolMortar, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERDITIO, 2L));
        GregTech_API.registerTool(addTool(WIRECUTTER, "Wire Cutter", EMPTY_STRING, new GT_Tool_WireCutter(), ToolDictNames.craftingToolWireCutter, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sWireCutterList);
        addTool(28, "Scoop", EMPTY_STRING, new GT_Tool_Scoop(), ToolDictNames.craftingToolScoop, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.BESTIA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PANNUS, 2L));
        addTool(30, "Branch Cutter", EMPTY_STRING, new GT_Tool_BranchCutter(), ToolDictNames.craftingToolBranchCutter, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.HERBA, 2L));
        GregTech_API.registerTool(addTool(32, "Universal Spade", EMPTY_STRING, new GT_Tool_UniversalSpade(), ToolDictNames.craftingToolBlade, ToolDictNames.craftingToolShovel, ToolDictNames.craftingToolCrowbar, ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.TELUM, 1L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 1L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 1L)), GregTech_API.sCrowbarList);
        addTool(34, "Knife", EMPTY_STRING, new GT_Tool_Knife(), ToolDictNames.craftingToolBlade, ToolDictNames.craftingToolKnife, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.TELUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.CORPUS, 2L));
        addTool(36, "Butchery Knife", "Has a slow Attack Rate", new GT_Tool_ButcheryKnife(), ToolDictNames.craftingToolBlade, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.CORPUS, 4L));

        addTool(40, "Sense", "Because a Scythe doesn't make Sense", new GT_Tool_Sense(), ToolDictNames.craftingToolBlade, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.HERBA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.MORTUUS, 2L));
        addTool(42, "Plow", "Used to get rid of Snow", new GT_Tool_Plow(), ToolDictNames.craftingToolPlow, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.GELUM, 2L));
        addTool(44, "Plunger", EMPTY_STRING, new GT_Tool_Plunger(), ToolDictNames.craftingToolPlunger, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ITER, 2L));
        addTool(46, "Rolling Pin", EMPTY_STRING, new GT_Tool_RollingPin(), ToolDictNames.craftingToolRollingPin, new TC_Aspects.TC_AspectStack(TC_Aspects.INSTRUMENTUM, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.LIMUS, 4L));

        addTool(100, "Drill (LV)", EMPTY_STRING, new GT_Tool_Drill_LV(), ToolDictNames.craftingToolMiningDrill, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 4L));
        addTool(102, "Drill (MV)", EMPTY_STRING, new GT_Tool_Drill_MV(), ToolDictNames.craftingToolMiningDrill, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 4L));
        addTool(104, "Drill (HV)", EMPTY_STRING, new GT_Tool_Drill_HV(), ToolDictNames.craftingToolMiningDrill, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 4L));
        addTool(110, "Chainsaw (LV)", "Can also harvest Ice", new GT_Tool_Chainsaw_LV(), ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        addTool(112, "Chainsaw (MV)", "Can also harvest Ice", new GT_Tool_Chainsaw_MV(), ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        addTool(114, "Chainsaw (HV)", "Can also harvest Ice", new GT_Tool_Chainsaw_HV(), ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.METO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        GregTech_API.registerTool(addTool(WRENCH_LV, "Wrench (LV)", "Hold Leftclick to dismantle Machines", new GT_Tool_Wrench_LV(), ToolDictNames.craftingToolWrench, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 4L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sWrenchList);
        GregTech_API.registerTool(addTool(WRENCH_MV, "Wrench (MV)", "Hold Leftclick to dismantle Machines", new GT_Tool_Wrench_MV(), ToolDictNames.craftingToolWrench, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 4L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sWrenchList);
        GregTech_API.registerTool(addTool(WRENCH_HV, "Wrench (HV)", "Hold Leftclick to dismantle Machines", new GT_Tool_Wrench_HV(), ToolDictNames.craftingToolWrench, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 4L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sWrenchList);
        addTool(130, "JackHammer (HV)", "Breaks Rocks into pieces", new GT_Tool_JackHammer(), ToolDictNames.craftingToolJackHammer, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERFODIO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.PERDITIO, 2L));
        addTool(140, "Buzzsaw (LV)", "Not suitable for harvesting Blocks", new GT_Tool_BuzzSaw(), ToolDictNames.craftingToolSaw, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ARBOR, 2L));
        GregTech_API.registerTool(addTool(150, "Screwdriver (LV)", "Adjusts Covers and Machines", new GT_Tool_Screwdriver_LV(), ToolDictNames.craftingToolScrewdriver, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sScrewdriverList);
        GregTech_API.registerTool(addTool(SOLDERING_IRON_LV, "Soldering Iron (LV)", "Fixes burned out Circuits. Needs soldering materials in inventory and 10kEU", new GT_Tool_Soldering_Iron(), ToolDictNames.craftingToolSolderingIron, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.FABRICO, 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sSolderingToolList);

        addTool(TURBINE_SMALL, "Small Turbine", "Turbine Rotors for your power station", new GT_Tool_Turbine_Small());
        addTool(TURBINE, "Turbine", "Turbine Rotors for your power station", new GT_Tool_Turbine_Normal());
        addTool(TURBINE_LARGE, "Large Turbine", "Turbine Rotors for your power station", new GT_Tool_Turbine_Large());
        addTool(TURBINE_HUGE, "Huge Turbine", "Turbine Rotors for your power station", new GT_Tool_Turbine_Huge());

        GregTech_API.registerTool(addTool(180, "Swiss Army Knife", "Pocketknife Multi-Tool!", new GT_Tool_Multi(), ToolDictNames.craftingToolKnife, ToolDictNames.craftingToolBlade, ToolDictNames.craftingToolSaw, ToolDictNames.craftingToolScrewdriver, ToolDictNames.craftingToolWireCutter, ToolDictNames.craftingToolFile, new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 4L), new TC_Aspects.TC_AspectStack(TC_Aspects.ORDO, 2L)), GregTech_API.sScrewdriverList);

        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("Flint"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', new ItemStack(Items.flint, 1), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("Bronze"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("Bronze")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("Iron"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("Iron")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("Steel"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("Steel")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("WroughtIron"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("WroughtIron")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("RedSteel"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("RedSteel")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("BlueSteel"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("BlueSteel")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("BlackSteel"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("BlackSteel")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("DamascusSteel"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("DamascusSteel")), 'S', OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(24, 1, Materials.get("Thaumium"), Materials.get("Stone"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" I ", "SIS", "SSS", 'I', OrePrefixes.ingot.get(Materials.get("Thaumium")), 'S', OrePrefixes.stone});

        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(46, 1, Materials.get("Wood"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"  S", " I ", "S f", 'I', OrePrefixes.plank.get(Materials.get("Wood")), 'S', OrePrefixes.stick.get(Materials.get("Wood"))});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(46, 1, Materials.get("Plastic"), Materials.get("Plastic"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"  S", " I ", "S f", 'I', OrePrefixes.ingot.get(Materials.get("Plastic")), 'S', OrePrefixes.stick.get(Materials.get("Plastic"))});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(46, 1, Materials.get("Aluminium"), Materials.get("Aluminium"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"  S", " I ", "S f", 'I', OrePrefixes.ingot.get(Materials.get("Aluminium")), 'S', OrePrefixes.stick.get(Materials.get("Aluminium"))});
        GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(46, 1, Materials.get("StainlessSteel"), Materials.get("StainlessSteel"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"  S", " I ", "S f", 'I', OrePrefixes.ingot.get(Materials.get("StainlessSteel")), 'S', OrePrefixes.stick.get(Materials.get("StainlessSteel"))});


        if (!GregTech_API.sSpecialFile.get(ConfigCategories.general, "DisableFlintTools", false)) {
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(0, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"F", "F", "S", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(2, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"FFF", " S ", " S ", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(4, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"F", "S", "S", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(6, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.MIRRORED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"FF", "FS", " S", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(8, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.MIRRORED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"FF", " S", " S", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
            GT_ModHandler.addCraftingRecipe(INSTANCE.getToolWithStats(34, 1, Materials.get("Flint"), Materials.get("Wood"), null), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"F", "S", 'S', OrePrefixes.stick.get(Materials.get("Wood")), 'F', new ItemStack(Items.flint, 1)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Tools.mortar, "Coal", true)) {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Coal"), 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ToolDictNames.craftingToolMortar, new ItemStack(Items.coal, 1)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Tools.mortar, "Clay", true)) {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Clay"), 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ToolDictNames.craftingToolMortar, new ItemStack(Blocks.clay, 1)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Tools.mortar, "Wheat", true)) {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.get("Wheat"), 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ToolDictNames.craftingToolMortar, new ItemStack(Items.wheat, 1)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Tools.mortar, "Flint", true)) {
            GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Items.flint, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ToolDictNames.craftingToolMortar, new ItemStack(Blocks.gravel, 1)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Tools.mortar, "Blaze", true)) {
            GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Items.blaze_powder, 2), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ToolDictNames.craftingToolMortar, new ItemStack(Items.blaze_rod, 1)});
        }
    }
}
