
package com.gmail.rohzek.smithtable.lib;

import com.gmail.rohzek.smithtable.recipe.SmithingTableRecipe;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DeferredRegistration 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Reference.MODID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Reference.MODID);
	
	public static final RegistryObject<RecipeSerializer<SmithingTableRecipe>> SMITHING_TABLE_RECIPE_SERIALIZER = RECIPE_SERIALIZERS.register("smithing_table", () -> SmithingTableRecipe.Serializer.INSTANCE);
	
	public static void register() 
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ITEMS.register(bus);
		RECIPE_SERIALIZERS.register(bus);
		RECIPE_TYPES.register(bus);
	}
}