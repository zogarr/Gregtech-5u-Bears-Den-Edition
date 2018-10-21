package gregtech.loaders.oreprocessing;

import gregtech.api.materials.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_Utility;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.NULL_FLUID_STACK;
import static gregtech.api.enums.GT_Values.RECIPE_ADDER_INSTANCE;

public class ProcessingArrows implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingArrows() {
        for (OrePrefixes tPrefix : OrePrefixes.values())
            if (tPrefix.name().startsWith("arrowGt")) {
                tPrefix.add(this);
            }
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        ItemStack tOutput = GT_Utility.copyAmount(1L, aStack);
        GT_Utility.updateItemStack(tOutput);
        GT_Utility.ItemNBT.addEnchantment(tOutput, Enchantment.smite, EnchantmentHelper.getEnchantmentLevel(Enchantment.smite.effectId, tOutput) + 3);
        RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.get("HolyWater").getFluid(25L), NULL_FLUID_STACK, tOutput, null, null, null, 100, 2);

        tOutput = GT_Utility.copyAmount(1L, aStack);
        GT_Utility.updateItemStack(tOutput);
        GT_Utility.ItemNBT.addEnchantment(tOutput, Enchantment.fireAspect, EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, tOutput) + 3);
        RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.get("FierySteel").getFluid(25L), NULL_FLUID_STACK, tOutput, null, null, null, 100, 2);

        tOutput = GT_Utility.copyAmount(1L, aStack);
        GT_Utility.updateItemStack(tOutput);
        GT_Utility.ItemNBT.addEnchantment(tOutput, Enchantment.fireAspect, EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, tOutput) + 1);
        RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.get("Blaze").getMolten(18L), NULL_FLUID_STACK, tOutput, null, null, null, 100, 2);

        tOutput = GT_Utility.copyAmount(1L, aStack);
        GT_Utility.updateItemStack(tOutput);
        GT_Utility.ItemNBT.addEnchantment(tOutput, Enchantment.knockback, EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, tOutput) + 1);
        RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.get("Rubber").getMolten(18L), NULL_FLUID_STACK, tOutput, null, null, null, 100, 2);

        tOutput = GT_Utility.copyAmount(1L, aStack);
        GT_Utility.updateItemStack(tOutput);
        GT_Utility.ItemNBT.addEnchantment(tOutput, gregtech.api.enchants.Enchantment_EnderDamage.INSTANCE, EnchantmentHelper.getEnchantmentLevel(gregtech.api.enchants.Enchantment_EnderDamage.INSTANCE.effectId, tOutput) + 1);
        RECIPE_ADDER_INSTANCE.addChemicalBathRecipe(GT_Utility.copyAmount(1L, aStack), Materials.get("Mercury").getFluid(25L), NULL_FLUID_STACK, tOutput, null, null, null, 100, 2);
    }
}
