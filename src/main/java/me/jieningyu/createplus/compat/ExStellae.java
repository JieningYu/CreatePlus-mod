package me.jieningyu.createplus.compat;

import me.jieningyu.createplus.CreatePlus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExStellae {
	public static Item ZINC_ORE_PIECE = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static Item ZINC_ORE_CHUNK = new Item(new Item.Settings().group(CreatePlus.ITEM_GROUP));
	public static void register() {
		Registry.register(Registry.ITEM, new Identifier("createplus", "zinc_ore_piece"), ZINC_ORE_PIECE);
		Registry.register(Registry.ITEM, new Identifier("createplus", "zinc_ore_chunk"), ZINC_ORE_CHUNK);
	}
}
