package com.gmail.rohzek.smithtable.armor;

import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import com.gmail.rohzek.smithtable.lib.Reference;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class AUSArmors 
{
	public static final Holder<ArmorMaterial> COPPER_ARMOR_MATERIAL = DeferredRegistration.ARMOR_MATERIALS.register("copper", () -> new ArmorMaterial(
			Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(Type.BOOTS, 2);
				map.put(Type.LEGGINGS, 5);
				map.put(Type.CHESTPLATE, 6);
				map.put(Type.HELMET, 2);
				map.put(Type.BODY, 4);
			}),
			9,
			SoundEvents.ARMOR_EQUIP_GENERIC,
			() -> Ingredient.of(Tags.Items.INGOTS_COPPER),
			List.of(
					new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Reference.MODID, "copper"))
			),
			0f,
			0f
	));
	public static final Supplier<ArmorItem> COPPER_HELMET = DeferredRegistration.ITEMS.register("copper_helmet", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.HELMET, new Item.Properties().durability(Type.HELMET.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_CHESTPLATE = DeferredRegistration.ITEMS.register("copper_chestplate", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Properties().durability(Type.CHESTPLATE.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_LEGGINGS = DeferredRegistration.ITEMS.register("copper_leggings", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Properties().durability(Type.LEGGINGS.getDurability(15))));
	public static final Supplier<ArmorItem> COPPER_BOOTS = DeferredRegistration.ITEMS.register("copper_boots", () -> new ArmorItem(COPPER_ARMOR_MATERIAL, Type.BOOTS, new Item.Properties().durability(Type.BOOTS.getDurability(15))));
	public static final Supplier<AnimalArmorItem> COPPER_HORSE_ARMOR = DeferredRegistration.ITEMS.register("copper_horse_armor", () -> new CustomHorseArmor(COPPER_ARMOR_MATERIAL, "copper"));
	public static final DeferredItem<AnimalArmorItem> NETHERITE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("netherite_horse_armor", () -> new CustomHorseArmor(ArmorMaterials.NETHERITE, "netherite"));

	public static void register() {}
}