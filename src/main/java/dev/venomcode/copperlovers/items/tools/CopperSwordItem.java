package dev.venomcode.copperlovers.items.tools;

import dev.venomcode.copperlovers.CopperLoversMod;
import dev.venomcode.vanillify.api.VanillaUtils;
import dev.venomcode.vanillify.api.interfaces.ItemStackProxy;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.*;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CopperSwordItem extends SwordItem implements ItemStackProxy {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public CopperSwordItem(ToolMaterial mat, int dmg, float speed, Item.Settings settings) {
        super(mat, dmg, speed, settings);
    }

    @Override
    public ItemStack getClientItemStack(ItemStack itemStack) {
        ItemStack tmp = new ItemStack(Items.GOLDEN_SWORD, 1);

        tmp.setDamage(Math.round((float)itemStack.getDamage() / (float)itemStack.getMaxDamage() * Items.GOLDEN_PICKAXE.getMaxDamage()));
        tmp.setCustomName(VanillaUtils.getText("Copper Sword", Formatting.GOLD));


        List<MutableText> loreList = new ArrayList<>();
        loreList.add(VanillaUtils.getText("Durability: " + df.format( (((float)itemStack.getMaxDamage() - (float)itemStack.getDamage()) / (float)itemStack.getMaxDamage()) * 100F ) +"%", Formatting.BOLD, Formatting.AQUA));

        EnchantmentHelper.set(EnchantmentHelper.get(itemStack), tmp);

        VanillaUtils.setStackLore(tmp, loreList);

        VanillaUtils.setStackModelData(tmp, 312);

        return tmp;
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(CopperLoversMod.MODID, "copper_sword");
    }
}
