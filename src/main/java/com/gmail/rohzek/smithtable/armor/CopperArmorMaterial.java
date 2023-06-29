package com.gmail.rohzek.smithtable.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum CopperArmorMaterial implements ArmorMaterial
{
	COPPER("copper", 11, new int[] {2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, Ingredient.of(Items.COPPER_INGOT));
	
	private String name;
	
	//Holds the maximum damage factor (each piece multiply this by it's own value) of the material, this is the item damage (how much can absorb before breaks)
	private int maxDamageFactor;
	
	// Holds the damage reduction (each 1 points is half a shield on gui) of each piece of armor (helmet, plate, legs and boots)
	private int[] damageReductionAmountArray;
	private int enchantability;
	private SoundEvent soundEvent;
	private float toughness;
	private float knockback;
	private Ingredient repairMaterial;
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	
	private CopperArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Ingredient ingredient) 
	{
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.knockback = knockbackResistance;
		this.repairMaterial = ingredient;
	}
	
	CopperArmorMaterial(String string, int i, int[] js, int j, SoundEvent armorEquipIron, float f, float g, Object object) 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getDurabilityForType(Type slot) 
	{
		return MAX_DAMAGE_ARRAY[slot.getSlot().getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDefenseForType(Type slot) 
	{
		return this.damageReductionAmountArray[slot.getSlot().getIndex()];
	}

	@Override
	public int getEnchantmentValue() 
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() 
	{
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairIngredient() 
	{
		return this.repairMaterial;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public String getName() 
	{
		return this.name;
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() 
	{
		return this.knockback;
	}
	
}