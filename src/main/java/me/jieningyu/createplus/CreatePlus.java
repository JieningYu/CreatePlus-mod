package me.jieningyu.createplus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.fabricmc.fabric.api.resource.ResourceManagerHelper.registerBuiltinResourcePack;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import me.jieningyu.createplus.compat.MythicMetals;
import me.jieningyu.createplus.compat.Trinkets;
import me.jieningyu.createplus.compat.MIndustrialization;

public class CreatePlus implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("CreatePlus");
	public static final String NAMESPACE = "createplus";
	public static final ResourcePackActivationType PACK_TYPE = ResourcePackActivationType.DEFAULT_ENABLED;

	public static ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(NAMESPACE, "item_group")).icon(() -> new ItemStack(CreatePlusItems.CHOCOLATE_BLUEBERRIES)).build();

	@Override
	public void onInitialize() {
		FabricLoader.getInstance().getModContainer(NAMESPACE).ifPresent(modContainer -> {
            registerBuiltinResourcePack(new Identifier(NAMESPACE, "createplus-core"), modContainer, PACK_TYPE);
        });

		CreatePlusItems.register();
		StrayLootTweak.init();

		if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {MythicMetals.register();}
		if (FabricLoader.getInstance().isModLoaded("modern_industrialization")) {MIndustrialization.register();}
		if (FabricLoader.getInstance().isModLoaded("trinkets")) {Trinkets.init();}
	}
}
