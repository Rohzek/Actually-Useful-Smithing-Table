package com.gmail.rohzek.smithtable.armor;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CopperArmor extends ArmorItem
{

	public CopperArmor(ArmorMaterial material, Type slot) 
	{
		super(material, slot, new Item.Properties().stacksTo(1));
	}
	
	@Override
	public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) 
	{
		// Have to return the exact path to the armor, just passing standard resource location won't work
		return Reference.RESOURCEID + "textures/models/armor/copper" + (slot == EquipmentSlot.LEGS ? "_layer_2" : "_layer_1") + ".png";
	}
}