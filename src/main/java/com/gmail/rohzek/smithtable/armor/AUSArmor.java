package com.gmail.rohzek.smithtable.armor;

import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.registries.RegistryObject;

public class AUSArmor 
{
	public static final RegistryObject<CopperArmor> COPPER_HELMET = DeferredRegistration.ITEMS.register("copper_helmet", () -> new CopperArmor(CopperArmorMaterial.COPPER, EquipmentSlot.HEAD));
	public static final RegistryObject<CopperArmor> COPPER_CHESTPLATE = DeferredRegistration.ITEMS.register("copper_chestplate", () -> new CopperArmor(CopperArmorMaterial.COPPER, EquipmentSlot.CHEST));
	public static final RegistryObject<CopperArmor> COPPER_LEGGINGS = DeferredRegistration.ITEMS.register("copper_leggings", () -> new CopperArmor(CopperArmorMaterial.COPPER, EquipmentSlot.LEGS));
	public static final RegistryObject<CopperArmor> COPPER_BOOTS = DeferredRegistration.ITEMS.register("copper_boots", () -> new CopperArmor(CopperArmorMaterial.COPPER, EquipmentSlot.FEET));
	
	public static void register() {}
}
