package me.jieningyu.createplus.compat;

import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import me.jieningyu.createplus.CreatePlus;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Optional;
import com.simibubi.create.content.contraptions.goggles.GogglesItem;
import org.quiltmc.loader.api.QuiltLoader;


public class Trinkets {
	public static Item GOGGLES = new Item(new Item.Settings().maxCount(1).group(CreatePlus.ITEM_GROUP));
	//using create api
	static{GogglesItem.addIsWearingPredicate(player -> isTrinketEquipped(GOGGLES, player));}

	public static boolean isTrinketEquipped(Item item, LivingEntity player){
		if (!QuiltLoader.isModLoaded("trinkets")) {return false;}
		Optional<TrinketComponent> trinket = TrinketsApi.getTrinketComponent(player);
		if (trinket.get().isEquipped(item)) {return true;}
		return false;
	}
	public static void init(){
		Registry.register(Registry.ITEM, new Identifier("createplus", "goggles"), GOGGLES);
	}
}
