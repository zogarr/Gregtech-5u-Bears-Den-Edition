package gregtech.loaders.oreprocessing;

import gregtech.api.enums.MaterialsOld;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingIngot2 implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingIngot2() {
        OrePrefixes.ingotDouble.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, MaterialsOld aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        if (!aMaterial.contains(gregtech.api.enums.SubTag.NO_SMASHING)) {
            RECIPE_ADDER_INSTANCE.addBenderRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.plateDouble, aMaterial, 1L), (int) Math.max(aMaterial.getMass() * 1L, 1L), 96);
            RECIPE_ADDER_INSTANCE.addBenderRecipe(GT_Utility.copyAmount(2L, aStack), GT_OreDictUnificator.get(OrePrefixes.plateQuadruple, aMaterial, 1L), (int) Math.max(aMaterial.getMass() * 2L, 1L), 96);
        }
    }
}
