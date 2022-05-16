package me.jieningyu.createplus.compat;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import me.jieningyu.createplus.CreatePlus;


public class MIndustrialization {
	public static Item BRASS_DRILL_HEAD = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item BRASS_DRILL = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static void register() {
		Registry.register(Registry.ITEM, new Identifier("createplus", "brass_drill_head"), BRASS_DRILL_HEAD);
		Registry.register(Registry.ITEM, new Identifier("createplus", "brass_drill"), BRASS_DRILL);
	}
}
