package me.jieningyu.createplus;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class Uniergy {
	//A system that allow players to convert energy using powder snow.
	public static final Item POWDERED_SNOWBALL = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static final Item HEATING_SNOWBALL_MID = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static final Item HEATING_SNOWBALL_HOT = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static final Item HEATING_SNOWBALL_WARM = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));

	public static void init() {
		Registry.register(Registry.ITEM, new Identifier("createplus", "powdered_snowball"), POWDERED_SNOWBALL);
		Registry.register(Registry.ITEM, new Identifier("createplus", "heating_powdered_snowball"), HEATING_SNOWBALL_MID);
		Registry.register(Registry.ITEM, new Identifier("createplus", "heating_powdered_snowball_hot"), HEATING_SNOWBALL_HOT);
		Registry.register(Registry.ITEM, new Identifier("createplus", "heating_powdered_snowball_warm"), HEATING_SNOWBALL_HOT);
		FuelRegistry.INSTANCE.add(HEATING_SNOWBALL_MID, 40);
		FuelRegistry.INSTANCE.add(HEATING_SNOWBALL_WARM, 20);
		FuelRegistry.INSTANCE.add(HEATING_SNOWBALL_HOT, 80);
	}
}
