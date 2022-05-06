package me.jieningyu.createplus.compat;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import me.jieningyu.createplus.CreatePlus;


public class MythicMetals {
	public static Item CRUSHED_ADAMANTITE_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_AQUARIUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_BANGLUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_CARMOT_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_KYBER_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_MANGANESE_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_MIDAS_GOLD_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_MYTHRIL_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_ORICHALCUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_PALLADIUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_PROMETHEUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_QUADRILLUM_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_RUNITE_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item CRUSHED_STORMYX_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static void register() {
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
	}
}
