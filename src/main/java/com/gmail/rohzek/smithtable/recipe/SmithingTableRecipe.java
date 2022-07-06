package com.gmail.rohzek.smithtable.recipe;

import javax.annotation.Nullable;

import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.Reference;
import com.google.gson.JsonObject;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.item.crafting.SmithingRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class SmithingTableRecipe extends SmithingRecipe
{
	final Ingredient input;
	final Ingredient upgrader;
	final ItemStack output;
	
	public SmithingTableRecipe(ResourceLocation location, Ingredient input, Ingredient upgrader, ItemStack output) 
	{
		super(location, input, upgrader, output);
		
		this.input = input;
		this.upgrader = upgrader;
		this.output = output;
	}
	
	@Override
	public boolean matches(IInventory container, World world) 
	{
		if(ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("hard") && !upgrader.getItems()[0].getDisplayName().toString().toLowerCase().contains("block")) 
		{	
			return false;
		}
		
		if(ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("easy") && upgrader.getItems()[0].getDisplayName().toString().toLowerCase().contains("block")) 
		{	
			return false;
		}
		
		if(ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("normal") && !ConfigurationManager.GENERAL.repairOnNormal.get() && upgrader.getItems()[0].getDisplayName().toString().toLowerCase().contains("block")) 
		{	
			return false;
		}
		
		else 
		{
			return super.matches(container, world);
		}
	}
	
	@Override
	public ItemStack assemble(IInventory container) 
	{
		ItemStack itemstack = this.output.copy();
		ItemStack input = container.getItem(0);
		CompoundNBT compoundtag = input.getTag();
		
	      if (compoundtag != null) 
	      {
	         itemstack.setTag(compoundtag.copy());
	      }
	      
	      // If on easy mode, or normal with repairing blocks and a block is provided, we should fully repair tools
	      if(!ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("hard"))
	      {
	    	  if(ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("easy")) 
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  
	    	  else if(ConfigurationManager.GENERAL.repairOnNormal.get() && upgrader.getItems()[0].getDisplayName().toString().toLowerCase().contains("block"))
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  
	    	  else 
		      {  
		    	  itemstack.setDamageValue(getNewHealth(itemstack.getMaxDamage(), getPercentage(input.getDamageValue(), input.getMaxDamage())));
		      }
	      }
	      
	      // Otherwise, we should set a repair value on the new one equal to the amount of damage on the old. E.G. 50% of damage on old = 50% damage on new
	      // This will fix Issue #6 while also balancing out the mod a little bit
	      else 
	      {
	    	  if(ConfigurationManager.GENERAL.repairOnHard.get()) 
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  else 
	    	  {
	    		  itemstack.setDamageValue(getNewHealth(itemstack.getMaxDamage(), getPercentage(input.getDamageValue(), input.getMaxDamage())));
	    	  }
	      }

	      return itemstack;
	}
	
	/**
	 * @param x: The current amount of damage on current tool
	 * @param y: The current max damage of the current tool
	 * @return Percentage left of current tools HP
	 * 
	 * Example: x = 249, y = 250 (Iron Sword)
	 * This means there's 249 hit points left of 250
	 * x / y = (249 / 250) which is 0.996
	 * (0.996 * 100) = 99.6% HP left
	 */
	float getPercentage(int x, int y)
	{
		return (((float) x / (float) y) * (float) 100);
	}
	
	/**
	 * 
	 * @param x Total of new tools HP
	 * @param z The percentage of HP the old tool had left
	 * @return The total amount of damage the new tool should be set to, shortened to an int because setDamageValue accepts an int
	 * 
	 * Example: x = 32 (Gold Sword) y = 45.2 (percentage of HP left on Iron Sword)
	 * 32 * (45.2 / 100) = 14.464 so 14.5 is roughly about 45.2% of 32
	 * 32 - 14.646 = 17.354 or just 17, so we should apply 17 points of damage to have 14 (45%) HP points left
	 */
	int getNewHealth(int x, float z) 
	{
		return (int) (x * (z / 100));
	}
	
	@Override
	public IRecipeType<?> getType() 
	{
		return Type.SMITHING;
	}
	
	public static class Type implements IRecipeType<SmithingTableRecipe>
	{
		private Type() {}
		public static final Type INSTANCE = new Type();
		public static final String ID = "smithing_table";
	}
	
	public static class Serializer implements IRecipeSerializer<SmithingTableRecipe>
	{
		public static final Serializer INSTANCE = new Serializer();
		public static final ResourceLocation ID = new ResourceLocation(Reference.MODID, "smithing_table");
		
		@Override
		public SmithingTableRecipe fromJson(ResourceLocation location, JsonObject json) 
		{
			Ingredient ingredient = Ingredient.fromJson(JSONUtils.getAsJsonObject(json, "base"));
	        Ingredient ingredient1 = Ingredient.fromJson(JSONUtils.getAsJsonObject(json, "addition"));
	        ItemStack itemstack = ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json, "result"));
	        
	        return new SmithingTableRecipe(location, ingredient, ingredient1, itemstack);
		}

		@Override
		public @Nullable SmithingTableRecipe fromNetwork(ResourceLocation location, PacketBuffer bytebuf) 
		{
			Ingredient ingredient = Ingredient.fromNetwork(bytebuf);
	        Ingredient ingredient1 = Ingredient.fromNetwork(bytebuf);
	        ItemStack itemstack = bytebuf.readItem();
	        
	        return new SmithingTableRecipe(location, ingredient, ingredient1, itemstack);
		}

		@Override
		public void toNetwork(PacketBuffer bytebuf, SmithingTableRecipe recipe) 
		{
			recipe.input.toNetwork(bytebuf);
			recipe.upgrader.toNetwork(bytebuf);
	        bytebuf.writeItem(recipe.output);
		}

		@Override
		public IRecipeSerializer<?> setRegistryName(ResourceLocation name) 
		{
			return INSTANCE;
		}

		@Override
		public ResourceLocation getRegistryName() 
		{
			return ID;
		}

		@Override
		public Class<IRecipeSerializer<?>> getRegistryType()
		{
			return Serializer.castClass(IRecipeSerializer.class);
		}

		// Wrapper due to generics? Or something? Not sure but it's required apparently due to above function
		@SuppressWarnings("unchecked")
		private static <G> Class<G> castClass(Class<?> cls) 
		{
			return (Class<G>)cls;
		}	
	}
}
