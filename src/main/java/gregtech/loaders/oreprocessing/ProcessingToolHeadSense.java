package gregtech.loaders.oreprocessing;

import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.common.items.GT_MetaGenerated_Tool_01;
import net.minecraft.item.ItemStack;

public class ProcessingToolHeadSense implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingToolHeadSense() {
        OrePrefixes.toolHeadSense.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        GT_ModHandler.addShapelessCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(40, 1, aMaterial, aMaterial.getHandleMaterial(), null), new Object[]{aOreDictName, OrePrefixes.stick.get(aMaterial.getHandleMaterial())});
    }
}
