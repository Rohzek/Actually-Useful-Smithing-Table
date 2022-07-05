package com.gmail.rohzek.smithtable.recipe;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.Reference;
import com.google.gson.JsonObject;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.UpgradeRecipe;
import net.minecraft.world.level.Level;

public class SmithingTableRecipe extends UpgradeRecipe
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
	public boolean matches(Container container, Level world) 
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
	public ItemStack assemble(Container container) 
	{
		ItemStack itemstack = this.output.copy();
		ItemStack input = container.getItem(0);
		CompoundTag compoundtag = input.getTag();
		
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
	public RecipeType<?> getType() 
	{
		return Type.SMITHING;
	}
	
	public static class Type implements RecipeType<SmithingTableRecipe>
	{
		private Type() {}
		public static final Type INSTANCE = new Type();
		public static final String ID = "smithing_table";
	}
	
	public static class Serializer implements RecipeSerializer<SmithingTableRecipe>
	{
		public static final Serializer INSTANCE = new Serializer();
		public static final ResourceLocation ID = new ResourceLocation(Reference.MODID, "smithing_table");
		
		@Override
		public SmithingTableRecipe fromJson(ResourceLocation location, JsonObject json) 
		{
			Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "base"));
	        Ingredient ingredient1 = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "addition"));
	        ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
	        
	        return new SmithingTableRecipe(location, ingredient, ingredient1, itemstack);
		}

		@Override
		public @Nullable SmithingTableRecipe fromNetwork(ResourceLocation location, FriendlyByteBuf bytebuf) 
		{
			Ingredient ingredient = Ingredient.fromNetwork(bytebuf);
	        Ingredient ingredient1 = Ingredient.fromNetwork(bytebuf);
	        ItemStack itemstack = bytebuf.readItem();
	        
	        return new SmithingTableRecipe(location, ingredient, ingredient1, itemstack);
		}

		@Override
		public void toNetwork(FriendlyByteBuf bytebuf, SmithingTableRecipe recipe) 
		{
			recipe.input.toNetwork(bytebuf);
			recipe.upgrader.toNetwork(bytebuf);
	        bytebuf.writeItem(recipe.output);
		}
		
	}
}
