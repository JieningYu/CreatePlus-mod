package me.jieningyu.createplus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import org.quiltmc.qsl.resource.loader.api.ResourceLoader;
import org.quiltmc.qsl.resource.loader.api.ResourcePackActivationType;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.loader.api.QuiltLoader;

import me.jieningyu.createplus.compat.MythicMetals;
import me.jieningyu.createplus.compat.Trinkets;
import me.jieningyu.createplus.compat.MIndustrialization;
import me.jieningyu.createplus.compat.ExStellae;
import me.jieningyu.createplus.compat.Indrev;
public class CreatePlus implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("CreatePlus");
	public static final String NAMESPACE = "createplus";
	public static final ResourcePackActivationType PACK_TYPE = ResourcePackActivationType.DEFAULT_ENABLED;

	public static ItemGroup ITEM_GROUP = QuiltItemGroup.builder(new Identifier(NAMESPACE, "item_group")).icon(() -> new ItemStack(CreatePlusItems.CHOCOLATE_BLUEBERRIES)).build();

	@Override
	public void onInitialize(ModContainer mod) {
		ResourceLoader.registerBuiltinResourcePack(new Identifier(NAMESPACE, "createplus-core"), PACK_TYPE);
		CreatePlusItems.register();
		StrayLootTweak.init();

		if (QuiltLoader.isModLoaded("mythicmetals")) {MythicMetals.register();}
		if (QuiltLoader.isModLoaded("indrev")) {Indrev.register();}
		if (QuiltLoader.isModLoaded("exstellae")) {ExStellae.register();}
		if (QuiltLoader.isModLoaded("modern_industrialization")) {MIndustrialization.register();}
		if (QuiltLoader.isModLoaded("trinkets")) {Trinkets.init();}
	}
}
