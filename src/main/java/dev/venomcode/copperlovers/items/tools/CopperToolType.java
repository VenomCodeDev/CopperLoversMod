package dev.venomcode.copperlovers.items.tools;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolType implements ToolMaterial {
    public static final CopperToolType INSTANCE = new CopperToolType();

    @Override
    public int getDurability() {
        return 350;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.STONE;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
