package gregtech.loaders.oreprocessing;

import appeng.api.config.TunnelType;
import appeng.core.Api;
import gregtech.GT_Mod;
import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingWire02 implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingWire02() {
        OrePrefixes.wireGt02.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        RECIPE_ADDER_INSTANCE.addBoxingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.get("Rubber"), 1L), GT_OreDictUnificator.get(OrePrefixes.cableGt02, aMaterial, 1L), 150, 8);
        RECIPE_ADDER_INSTANCE.addUnboxingRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt02, aMaterial, 1L), GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.get("Rubber"), 1L), 150, 8);
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt02, aMaterial, 1L), new Object[]{aOreDictName, OrePrefixes.plate.get(Materials.get("Rubber"))});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, aMaterial, 2L), new Object[]{aOreDictName});
        GT_ModHandler.addShapelessCraftingRecipe(GT_Utility.copyAmount(1L, aStack), new Object[]{OrePrefixes.wireGt01.get(aMaterial), OrePrefixes.wireGt01.get(aMaterial)});

        if (GT_Mod.gregtechproxy.mAE2Integration) {
            Api.INSTANCE.registries().p2pTunnel().addNewAttunement(aStack, TunnelType.IC2_POWER);
            Api.INSTANCE.registries().p2pTunnel().addNewAttunement(GT_OreDictUnificator.get(OrePrefixes.cableGt02, aMaterial, 1L), TunnelType.IC2_POWER);
        }
    }
}
