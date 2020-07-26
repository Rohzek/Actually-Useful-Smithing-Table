package com.gmail.rohzek.smithtable;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MODID)
public class ActuallyUsefulSmithingTable 
{
	public ActuallyUsefulSmithingTable() 
	{
		// Register the mod
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}
}
