
package com.gmail.rohzek.smithtable.lib;

import com.gmail.rohzek.smithtable.items.AUSItems;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class DeferredRegistration 
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.Items.createItems(Reference.MODID);
	public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(BuiltInRegistries.ARMOR_MATERIAL, Reference.MODID);
	public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITION_CODECS = DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, Reference.MODID);
	private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, Reference.MODID);

	public static void register(IEventBus bus)
	{
		ARMOR_MATERIALS.register(bus);
		ITEMS.register(bus);
		CONDITION_CODECS.register(bus);
		TABS.register(bus);
	}

	public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<ConfigCondition>> CONFIG_CONDITION = CONDITION_CODECS.register("config", () -> ConfigCondition.CODEC);

	public static final Supplier<CreativeModeTab> ITEM_GROUP = TABS.register(Reference.MODID, () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup." + Reference.MODID))
			.icon(() -> new ItemStack(AUSItems.SMITHING_TEMPLATE.get()))
			.displayItems((params, output) -> {
				ITEMS.getEntries().forEach(entry -> {
					output.accept(entry.get());
				});
			})
			.build()
	);
}