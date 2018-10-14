package gregtech.loaders.oreprocessing;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;

import static gregtech.api.enums.GT_Values.NULL_FLUID_STACK;
import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingDirty implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingDirty() {
        OrePrefixes.clump.add(this);
        OrePrefixes.shard.add(this);
        OrePrefixes.crushed.add(this);
        OrePrefixes.dirtyGravel.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, net.minecraft.item.ItemStack aStack) {
        RECIPE_ADDER_INSTANCE.addForgeHammerRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.dustImpure, aMaterial.getMaceratingInto(), 1L), 10, 16);
        GT_ModHandler.addPulverisationRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.dustImpure, aMaterial.getMaceratingInto(), GT_OreDictUnificator.get(OrePrefixes.dust, aMaterial.getMaceratingInto(), 1L), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, GT_Utility.selectItemInList(0, aMaterial.getMaceratingInto(), aMaterial.getOreByProducts()), 1L), 10, false);
        GT_ModHandler.addOreWasherRecipe(GT_Utility.copyAmount(1L, aStack), 1000, GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedPurified : OrePrefixes.dustPure, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, GT_Utility.selectItemInList(0, aMaterial.getMaceratingInto(), aMaterial.getOreByProducts()), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_Utility.copyAmount(1L, aStack), (int) Math.min(5000L, Math.abs(aMaterial.getMass() * 20L)), GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedCentrifuged : OrePrefixes.dust, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, GT_Utility.selectItemInList(1, aMaterial.getMaceratingInto(), aMaterial.getOreByProducts()), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L));

        if (aMaterial.contains(SubTag.WASHING_MERCURY))
            RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.Mercury.getFluid(1000L), NULL_FLUID_STACK, GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedPurified : OrePrefixes.dustPure, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, aMaterial.getMaceratingInto(), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), new int[]{10000, 7000, 4000}, 800, 8);
        if (aMaterial.contains(SubTag.WASHING_SODIUMPERSULFATE))
            RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.SodiumPersulfate.getFluid(1000L), NULL_FLUID_STACK, GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedPurified : OrePrefixes.dustPure, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, aMaterial.getMaceratingInto(), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), new int[]{10000, 7000, 4000}, 800, 8);
        for (Materials tMaterial : aMaterial.getOreByProducts()) {
            if (tMaterial.contains(SubTag.WASHING_MERCURY))
                RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.Mercury.getFluid(1000L), NULL_FLUID_STACK, GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedPurified : OrePrefixes.dustPure, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, tMaterial.getMaceratingInto(), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), new int[]{10000, 7000, 4000}, 800, 8);
            if (tMaterial.contains(SubTag.WASHING_SODIUMPERSULFATE))
                RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.SodiumPersulfate.getFluid(1000L), NULL_FLUID_STACK, GT_OreDictUnificator.get(aPrefix == OrePrefixes.crushed ? OrePrefixes.crushedPurified : OrePrefixes.dustPure, aMaterial, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, tMaterial.getMaceratingInto(), 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L), new int[]{10000, 7000, 4000}, 800, 8);
        }
    }
}
