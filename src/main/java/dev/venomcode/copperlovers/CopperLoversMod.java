package dev.venomcode.copperlovers;

import dev.venomcode.copperlovers.registries.ItemRegistry;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperLoversMod implements DedicatedServerModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("copper-lovers");
	public static final String MODID = "copperlovers";

	@Override
	public void onInitializeServer() {
		ItemRegistry.init();
	}
}
