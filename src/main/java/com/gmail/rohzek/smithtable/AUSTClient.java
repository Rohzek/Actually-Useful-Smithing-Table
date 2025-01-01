package com.gmail.rohzek.smithtable;

import com.gmail.rohzek.smithtable.lib.Reference;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value=Reference.MODID, dist= Dist.CLIENT)
public class AUSTClient {
	public AUSTClient(IEventBus modEventBus, ModContainer modContainer) {
		modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
	}
}
