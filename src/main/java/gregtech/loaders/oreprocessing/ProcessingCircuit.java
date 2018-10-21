package gregtech.loaders.oreprocessing;

import gregtech.api.enums.ItemList;
import gregtech.api.materials.Materials;
import gregtech.api.enums.OreDictNames;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.item.ItemStack;

public class ProcessingCircuit implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingCircuit() {
        OrePrefixes.circuit.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        switch (aMaterial.name()) {
            case "Good":
            case "Advanced":
            case "Data":
            case "Elite":
            case "Master":
            case "Ultimate":
                if (!gregtech.api.util.GT_OreDictUnificator.isBlacklisted(aStack))
                    GT_ModHandler.removeRecipeByOutput(aStack);
                break;
            case "Primitive":
                GT_ModHandler.removeRecipeByOutput(aStack);
                GT_ModHandler.addShapelessCraftingRecipe(ItemList.Circuit_Primitive.get(1L), new Object[]{GT_ModHandler.getIC2Item("casingadviron", 1L), OrePrefixes.wireGt01.get(Materials.get("RedAlloy")), OrePrefixes.wireGt01.get(Materials.get("RedAlloy")), OrePrefixes.wireGt01.get(Materials.get("Tin"))});
                break;
            case "Basic":
                GT_ModHandler.removeRecipeByOutput(aStack);
                GT_ModHandler.addCraftingRecipe(ItemList.Circuit_Basic.get(1L), new Object[]{"WWW", "CPC", "WWW", 'C', OrePrefixes.circuit.get(Materials.get("Primitive")), 'W', OreDictNames.craftingWireCopper, 'P', OrePrefixes.plate.get(Materials.get("Steel"))});
                GT_ModHandler.addCraftingRecipe(ItemList.Circuit_Basic.get(1L), new Object[]{"WCW", "WPW", "WCW", 'C', OrePrefixes.circuit.get(Materials.get("Primitive")), 'W', OreDictNames.craftingWireCopper, 'P', OrePrefixes.plate.get(Materials.get("Steel"))});
                GT_ModHandler.addShapelessCraftingRecipe(ItemList.Circuit_Basic.get(1L), new Object[]{ItemList.Circuit_Integrated.getWildcard(1L)});
        }
    }
}
