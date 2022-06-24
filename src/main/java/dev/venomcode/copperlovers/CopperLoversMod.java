package dev.venomcode.copperlovers;

import dev.venomcode.copperlovers.registries.ItemRegistry;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CopperLoversMod implements DedicatedServerModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("copper-lovers");
	public static final String MODID = "copperlovers";

	@Override
	public void onInitializeServer() {
		ItemRegistry.init();
	}

	public static List<MutableText> getLoreFromStack(ItemStack stack)
	{
		NbtCompound dispCompound = stack.getOrCreateSubNbt( "display" );

		NbtList loreListTag = dispCompound.getList("Lore", NbtElement.LIST_TYPE);

		List<MutableText> retList = new ArrayList<>();

		for(NbtElement el : loreListTag)
		{
			NbtString strEl = (NbtString)el;
			retList.add(Text.Serializer.fromJson(strEl.asString()));
		}

		return retList;
	}
}
