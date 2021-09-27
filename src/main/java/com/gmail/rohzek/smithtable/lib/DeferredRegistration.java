package com.gmail.rohzek.smithtable.lib;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DeferredRegistration 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
	
	public static void register() 
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ITEMS.register(bus);
	}
}
