package com.gmail.rohzek.smithtable;

import org.slf4j.Logger;

import com.gmail.rohzek.smithtable.armor.AUSArmors;
import com.gmail.rohzek.smithtable.event.CreativeTabsEvent;
import com.gmail.rohzek.smithtable.horsearmor.AUSHorseArmors;
import com.gmail.rohzek.smithtable.items.AUSItems;
import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.DeferredRegistration;
import com.gmail.rohzek.smithtable.lib.Reference;
import com.mojang.logging.LogUtils;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MODID)
public class ActuallyUsefulSmithingTable 
{
	public final static Logger LOGGER = LogUtils.getLogger();
	
	public ActuallyUsefulSmithingTable() 
	{
		// Register the mod
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.register(this);
		
		// Register items
		DeferredRegistration.register();
		AUSItems.register();
		AUSArmors.register();
		AUSHorseArmors.register();
		
		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
		
		// Register items to creative tabs
		CreativeTabsEvent ct = new CreativeTabsEvent();
		ct.registerCreativeTabs(modEventBus);
		
		/**
		 * To use any wooden planks use:
		 * "tag": "minecraft:planks"
		 * To use any stone that can be used to make tools:
		 * "tag": "minecraft:stone_tool_materials"
		 */
	}
}
