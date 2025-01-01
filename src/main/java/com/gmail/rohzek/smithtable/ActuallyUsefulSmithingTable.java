package com.gmail.rohzek.smithtable;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.gmail.rohzek.smithtable.armor.AUSArmors;
import com.gmail.rohzek.smithtable.items.AUSItems;
import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.DeferredRegistration;
import com.gmail.rohzek.smithtable.lib.Reference;
import com.mojang.logging.LogUtils;

@Mod(Reference.MODID)
public class ActuallyUsefulSmithingTable 
{
	public final static Logger LOGGER = LogUtils.getLogger();
	
	public ActuallyUsefulSmithingTable(IEventBus modEventBus, ModContainer modContainer)
	{
		// Register the mod
		//modEventBus.register(this);
		
		// Register items
		DeferredRegistration.register(modEventBus);
		AUSItems.register();
		AUSArmors.register();

		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modContainer.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
		
		/**
		 * To use any wooden planks use:
		 * "tag": "minecraft:planks"
		 * To use any stone that can be used to make tools:
		 * "tag": "minecraft:stone_tool_materials"
		 */
	}
}
