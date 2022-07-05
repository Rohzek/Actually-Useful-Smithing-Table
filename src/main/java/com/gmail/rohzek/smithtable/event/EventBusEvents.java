package com.gmail.rohzek.smithtable.event;

import com.gmail.rohzek.smithtable.recipe.SmithingTableRecipe;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class EventBusEvents 
{
	@SubscribeEvent
	public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) 
	{
		Registry.register(Registry.RECIPE_TYPE, SmithingTableRecipe.Type.ID, SmithingTableRecipe.Type.INSTANCE);
	}
}
