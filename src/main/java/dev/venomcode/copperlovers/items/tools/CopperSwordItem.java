package dev.venomcode.copperlovers.items.tools;

import dev.venomcode.copperlovers.CopperLoversMod;
import dev.venomcode.vanillify.api.VanillaUtils;
import dev.venomcode.vanillify.api.interfaces.ItemStackProxy;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class CopperSwordItem extends SwordItem implements ItemStackProxy {

    public CopperSwordItem(ToolMaterial mat, int dmg, float speed, Item.Settings settings) {
        super(mat, dmg, speed, settings);
    }

    @Override
    public ItemStack getClientItemStack(ItemStack itemStack) {
        ItemStack tmp = new ItemStack(Items.GOLDEN_SWORD, 1);

        tmp.setCustomName(VanillaUtils.getText("Copper Sword", Formatting.GOLD));

        VanillaUtils.setStackModelData(tmp, 312);

        return tmp;
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(CopperLoversMod.MODID, "copper_sword");
    }
}
