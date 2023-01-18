package com.gmail.rohzek.smithtable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gmail.rohzek.smithtable.armor.AUSArmor;
import com.gmail.rohzek.smithtable.items.ActuallyUsefulSmithingItems;
import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.DeferredRegistration;
import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MODID)
public class ActuallyUsefulSmithingTable 
{
	public final static Logger LOGGER = LogManager.getLogger();
	
	public ActuallyUsefulSmithingTable() 
	{
		// Register the mod
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		DeferredRegistration.register();
		ActuallyUsefulSmithingItems.register();
		AUSArmor.register();
		
		// Register configuration file
		final ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigurationManager.spec);
		
		/**
		 * To use any wooden planks use:
		 * "tag": "minecraft:planks"
		 * To use any stone that can be used to make tools:
		 * "tag": "minecraft:stone_tool_materials"
		 */
	}
}
