package me.jieningyu.createplus;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AllItems {
	//Crushed Ores
	public static Item CRUSHED_IRIDIUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_TUNGSTEN_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_TITANIUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_ANTIMONY_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));

	//Foodstuff
	public static Item CHOCOLATE_BLUEBERRIES = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(7).saturationModifier(0.8F).build()).group(CreatePlus.ITEM_GROUP));

	//Tech Stuff
	public static Item BRASS_DOUBLE_INGOT = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item ZINC_DOUBLE_INGOT = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item BRASS_DUST = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item ZINC_DUST = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));

	public static void register() {
		//Crushed Ores
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_iridium_ore"), CRUSHED_IRIDIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_tungsten_ore"), CRUSHED_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_titanium_ore"), CRUSHED_TITANIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_antimony_ore"), CRUSHED_ANTIMONY_ORE);

		//Foodstuff
		Registry.register(Registry.ITEM, new Identifier("createplus", "chocolate_glazed_blueberries"), CHOCOLATE_BLUEBERRIES);

		//Tech Stuff
		Registry.register(Registry.ITEM, new Identifier("createplus", "brass_double_ingot"), BRASS_DOUBLE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("createplus", "zinc_double_ingot"), ZINC_DOUBLE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("createplus", "brass_dust"), BRASS_DUST);
		Registry.register(Registry.ITEM, new Identifier("createplus", "zinc_dust"), ZINC_DUST);
	}
}
