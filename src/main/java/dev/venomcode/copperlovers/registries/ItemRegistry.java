package dev.venomcode.copperlovers.registries;

import dev.venomcode.copperlovers.items.tools.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;

public class ItemRegistry
{
    public static void init()
    {
        Registry.register(Registry.ITEM, COPPER_SHOVEL_ITEM.getIdentifier(), COPPER_SHOVEL_ITEM);
        Registry.register(Registry.ITEM, COPPER_PICK_ITEM.getIdentifier(), COPPER_PICK_ITEM);
        Registry.register(Registry.ITEM, COPPER_AXE_ITEM.getIdentifier(), COPPER_AXE_ITEM);
        Registry.register(Registry.ITEM, COPPER_SWORD_ITEM.getIdentifier(), COPPER_SWORD_ITEM);
    }

    public static final CopperShovelItem COPPER_SHOVEL_ITEM = new CopperShovelItem(CopperToolType.INSTANCE, 1.5F, -3.0F, new FabricItemSettings().maxCount(1));
    public static final CopperPickItem COPPER_PICK_ITEM = new CopperPickItem(CopperToolType.INSTANCE, 1, -2.8F, new FabricItemSettings().maxCount(1));
    public static final CopperAxeItem COPPER_AXE_ITEM = new CopperAxeItem(CopperToolType.INSTANCE, 6, -3.0F, new FabricItemSettings().maxCount(1));
    public static final CopperSwordItem COPPER_SWORD_ITEM = new CopperSwordItem(CopperToolType.INSTANCE, 3, -2.4F, new FabricItemSettings().maxCount(1));
}
