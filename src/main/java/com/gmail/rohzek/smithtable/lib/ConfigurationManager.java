package com.gmail.rohzek.smithtable.lib;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigurationManager 
{
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ForgeConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ForgeConfigSpec.ConfigValue<Boolean> isDebug;
    	public final ForgeConfigSpec.ConfigValue<String> difficulty;
    	public final ForgeConfigSpec.ConfigValue<Boolean> repairOnNormal;
    	public final ForgeConfigSpec.ConfigValue<Boolean> repairOnHard;
    	
    	public General(ForgeConfigSpec.Builder builder) 
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode logging [false/true|default:false]")
                    .translation("debugmode." + Reference.MODID + ".config")
                    .define("isDebug", false);
            
            difficulty = builder
            		.comment("Determines the difficulty level of the recipes. On easy mode all upgrades take ingots, and repair tools. On hard, only blocks upgrade tools, and only non-game-breaking repair occurs [easy/normal/hard|default:normal]")
            		.translation("difficulty." + Reference.MODID + ".config")
            		.define("difficulty", "normal");
            
            repairOnNormal = builder
                    .comment("Enables/Disables using Blocks of metal to fully repair tools while on normal mode (disables Block usage on Normal mode) [false/true|default:true]")
                    .translation("repairmode.normal." + Reference.MODID + ".config")
                    .define("repairOnNormal", true);
            
            repairOnHard = builder
                    .comment("Enables/Disables fully repairing tools while on hard mode [false/true|default:false]")
                    .translation("repairmode.hard." + Reference.MODID + ".config")
                    .define("repairOnHard", false);
            
            builder.pop();
        }
    }
}
