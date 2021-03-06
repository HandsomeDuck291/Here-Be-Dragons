package handsomeduck.herebedragons;

import handsomeduck.herebedragons.common.registry.EntityRegistry;
import handsomeduck.herebedragons.common.registry.ObjectRegistry;
//import handsomeduck.herebedragons.common.registry.TileRegistry;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class HereBeDragons implements ModInitializer {

	public static final String MOD_ID = "herebedragons";
	public static final Logger LOGGER = LogManager.getLogger("herebedragons");

	@Override
	public void onInitialize() {
		GeckoLib.initialize();

		ObjectRegistry.registerModItems();
		EntityRegistry.registerModEntities();
		new ObjectRegistry();
		new EntityRegistry();
		//new TileRegistry();



		LOGGER.info("Initialization done, Here Be Dragons!");
	}
}
