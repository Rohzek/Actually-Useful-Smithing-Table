package com.gmail.rohzek.smithtable.lib;

import com.gmail.rohzek.smithtable.ActuallyUsefulSmithingTable;


public class LogHelper 
{
	public static void Log(String message) 
	{
		ActuallyUsefulSmithingTable.LOGGER.info(message);
	}
	
	public static void Debug(String message) 
	{
		if(ConfigurationManager.GENERAL.isDebug.get()) 
		{
			ActuallyUsefulSmithingTable.LOGGER.debug(message);
		}
	}
}
