package com.gmail.rohzek.smithtable.lib;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;

public class ConfigurationManager
{
	private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ModConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ModConfigSpec.ConfigValue<Boolean> isDebug;
    	public final ModConfigSpec.ConfigValue<String> difficulty;
    	public final ModConfigSpec.ConfigValue<Boolean> repairOnNormal;
    	public final ModConfigSpec.ConfigValue<Boolean> repairOnHard;
    	
    	public General(ModConfigSpec.Builder builder)
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode logging [false/true|default:false]")
                    .translation("debugmode." + Reference.MODID + ".config")
                    .define("isDebug", false);
            
            difficulty = builder
            		.comment("Determines the difficulty level of the recipes. On easy mode all upgrades take ingots, and repair tools. On hard, only blocks upgrade tools, and only non-game-breaking repair occurs [easy/normal/hard|default:normal]")
            		.translation("difficulty." + Reference.MODID + ".config")
		            .define("difficulty", "normal", value -> List.of("easy","hard","normal").contains(value));
            
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
