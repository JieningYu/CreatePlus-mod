package me.jieningyu.createplus;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.simibubi.create.Create;

public class AllItems {
	//Crushed Ores
	//-Techreborn
	public static Item CRUSHED_IRIDIUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_TUNGSTEN_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	//-Alloygery
	public static Item CRUSHED_TITANIUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	//-Mythic Metals
	public static Item CRUSHED_ADAMANTITE_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_AQUARIUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_BANGLUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_CARMOT_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_KYBER_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_MANGANESE_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_MIDAS_GOLD_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_MYTHRIL_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_ORICHALCUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_PALLADIUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_PROMETHEUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_QUADRILLUM_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_RUNITE_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));
	public static Item CRUSHED_STORMYX_ORE = new Item(new Item.Settings().group(Create.BASE_CREATIVE_TAB));


	//Foodstuff
	public static Item CHOCOLATE_BLUEBERRIES = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(7).saturationModifier(0.8F).build()).group(Create.BASE_CREATIVE_TAB));

	public static void register() {
		//Crushed Ores
		//-Techreborn
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_iridium_ore"), CRUSHED_IRIDIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_tungsten_ore"), CRUSHED_TUNGSTEN_ORE);
		//-Alloygery
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_titanium_ore"), CRUSHED_TITANIUM_ORE);
		//-Mythic Metals
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_adamantite_ore"), CRUSHED_ADAMANTITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_aquarium_ore"), CRUSHED_AQUARIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_banglum_ore"), CRUSHED_BANGLUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_carmot_ore"), CRUSHED_CARMOT_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_kyber_ore"), CRUSHED_KYBER_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_manganese_ore"), CRUSHED_MANGANESE_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_midas_gold_ore"), CRUSHED_MIDAS_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_mythril_ore"), CRUSHED_MYTHRIL_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_orichalcum_ore"), CRUSHED_ORICHALCUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_palladium_ore"), CRUSHED_PALLADIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_prometheum_ore"), CRUSHED_PROMETHEUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_quadrillum_ore"), CRUSHED_QUADRILLUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_runite_ore"), CRUSHED_RUNITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "crushed_stormyx_ore"), CRUSHED_STORMYX_ORE);


		//Foodstuff
		Registry.register(Registry.ITEM, new Identifier("createplus", "chocolate_glazed_blueberries"), CHOCOLATE_BLUEBERRIES);
	}
}
