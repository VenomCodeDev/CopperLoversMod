package dev.venomcode.copperlovers.items.tools;

import dev.venomcode.copperlovers.CopperLoversMod;
import dev.venomcode.vanillify.api.VanillaUtils;
import dev.venomcode.vanillify.api.interfaces.ItemStackProxy;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class CopperAxeItem extends AxeItem implements ItemStackProxy {
    public CopperAxeItem(ToolMaterial mat, int dmg, float speed, Settings settings) {
        super(mat, dmg, speed, settings);
    }

    @Override
    public ItemStack getClientItemStack(ItemStack itemStack) {
        ItemStack tmp = new ItemStack(Items.GOLDEN_AXE, 1);

        tmp.setCustomName(VanillaUtils.getText("Copper Axe", Formatting.GOLD));

        VanillaUtils.setStackModelData(tmp, 311);

        return tmp;
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(CopperLoversMod.MODID, "copper_axe");
    }
}
