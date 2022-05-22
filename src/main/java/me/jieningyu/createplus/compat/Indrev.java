package me.jieningyu.createplus.compat;

import me.jieningyu.createplus.CreatePlus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Indrev {
	public static Item ZINC_PURIFIED_ORE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static void register() {
		Registry.register(Registry.ITEM, new Identifier("createplus", "zinc_purified_ore"), ZINC_PURIFIED_ORE);
	}
}
