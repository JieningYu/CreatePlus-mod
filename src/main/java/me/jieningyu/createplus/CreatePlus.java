package me.jieningyu.createplus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.Identifier;

import org.quiltmc.qsl.resource.loader.api.ResourceLoader;
import org.quiltmc.qsl.resource.loader.api.ResourcePackActivationType;

public class CreatePlus implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("CreatePlus");
	public static final String NAMESPACE = "createplus";
	public static final ResourcePackActivationType PACK_TYPE = ResourcePackActivationType.ALWAYS_ENABLED;

	@Override
	public void onInitialize(ModContainer mod) {
		ResourceLoader.registerBuiltinResourcePack(new Identifier(NAMESPACE, "createplus-core"), PACK_TYPE);

		AllItems.register();
	}
}
