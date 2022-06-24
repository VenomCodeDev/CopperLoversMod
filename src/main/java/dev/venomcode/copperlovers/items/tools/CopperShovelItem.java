package dev.venomcode.copperlovers.items.tools;

import dev.venomcode.copperlovers.CopperLoversMod;
import dev.venomcode.vanillify.api.VanillaUtils;
import dev.venomcode.vanillify.api.interfaces.ItemStackProxy;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class CopperShovelItem extends ShovelItem implements ItemStackProxy {

    public CopperShovelItem(ToolMaterial mat, float dmg, float speed, Settings settings)
    {
        super(mat, dmg, speed, settings);
    }

    @Override
    public ItemStack getClientItemStack(ItemStack itemStack)
    {
        ItemStack tmp = new ItemStack(Items.GOLDEN_SHOVEL, 1);

        tmp.setCustomName(VanillaUtils.getText("Copper Shovel", Formatting.GOLD));

        VanillaUtils.setStackModelData(tmp, 313);

        return tmp;
    }

    @Override
    public Identifier getIdentifier()
    {
        return new Identifier(CopperLoversMod.MODID, "copper_shovel");
    }
}
