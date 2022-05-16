package me.jieningyu.createplus;

import net.minecraft.util.Identifier;

//replace with qsl
//check and track this https://github.com/QuiltMC/quilt-standard-libraries/pull/54
	import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
	import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;

import net.minecraft.entity.EntityType;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

//TODO: impl this using QSL loot table api to achieve 100% QSL impl

public class StrayLootTweak {
	private static final Identifier STRAY_LOOT_TABLE_ID = EntityType.STRAY.getLootTableId();
	public static void init() {
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
			if (STRAY_LOOT_TABLE_ID.equals(id)) {
				FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
					.rolls(ConstantLootNumberProvider.create(1))
					.with(ItemEntry.builder(CreatePlusItems.ZINC_DUST))
					.conditionally(RandomChanceLootCondition.builder(0.11F));
				table.pool(poolBuilder);
			}
		});
	}
}
