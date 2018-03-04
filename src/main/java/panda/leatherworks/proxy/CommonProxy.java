package panda.leatherworks.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public abstract class CommonProxy {
	public void registerMessageHandlers(SimpleNetworkWrapper wrapper) {}

	public abstract void registerColorHandlers();

    public static void registerModels(ModelRegistryEvent event) {}
}