package dev.venomcode.copperlovers.items.tools;

import dev.venomcode.copperlovers.CopperLoversMod;
import dev.venomcode.vanillify.api.VanillaUtils;
import dev.venomcode.vanillify.api.interfaces.ItemStackProxy;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class CopperPickItem extends PickaxeItem implements ItemStackProxy
{
    public CopperPickItem(ToolMaterial mat, int dmg, float speed, Settings settings)
    {
        super(mat, dmg, speed, settings);
    }

    @Override
    public ItemStack getClientItemStack(ItemStack itemStack)
    {
        ItemStack tmp = new ItemStack(Items.GOLDEN_PICKAXE, 1);

        tmp.setCustomName(VanillaUtils.getText("Copper Pickaxe", Formatting.GOLD));

        VanillaUtils.setStackModelData(tmp, 310);

        return tmp;
    }

    @Override
    public Identifier getIdentifier()
    {
        return new Identifier(CopperLoversMod.MODID, "copper_pickaxe");
    }
}
