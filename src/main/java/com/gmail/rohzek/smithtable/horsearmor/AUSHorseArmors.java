package com.gmail.rohzek.smithtable.horsearmor;

import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import net.minecraftforge.registries.RegistryObject;

public class AUSHorseArmors
{
	public static final RegistryObject<CustomHorseArmor> COPPER_HORSE_ARMOR = DeferredRegistration.ITEMS.register("copper_horse_armor", () -> new CustomHorseArmor(4, "copper"));
	public static final RegistryObject<CustomHorseArmor> NETHERITE_HORSE_ARMOR = DeferredRegistration.ITEMS.register("netherite_horse_armor", () -> new CustomHorseArmor(13, "netherite"));
	
	public static void register() {}
}
