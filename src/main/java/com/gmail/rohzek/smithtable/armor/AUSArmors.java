package com.gmail.rohzek.smithtable.armor;

import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import net.minecraft.world.item.ArmorItem.Type;
import net.minecraftforge.registries.RegistryObject;

public class AUSArmors 
{
	public static final RegistryObject<CopperArmor> COPPER_HELMET = DeferredRegistration.ITEMS.register("copper_helmet", () -> new CopperArmor(CopperArmorMaterial.COPPER, Type.HELMET));
	public static final RegistryObject<CopperArmor> COPPER_CHESTPLATE = DeferredRegistration.ITEMS.register("copper_chestplate", () -> new CopperArmor(CopperArmorMaterial.COPPER, Type.CHESTPLATE));
	public static final RegistryObject<CopperArmor> COPPER_LEGGINGS = DeferredRegistration.ITEMS.register("copper_leggings", () -> new CopperArmor(CopperArmorMaterial.COPPER, Type.LEGGINGS));
	public static final RegistryObject<CopperArmor> COPPER_BOOTS = DeferredRegistration.ITEMS.register("copper_boots", () -> new CopperArmor(CopperArmorMaterial.COPPER, Type.BOOTS));
	
	public static void register() {}
}