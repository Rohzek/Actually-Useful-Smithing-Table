package com.gmail.rohzek.smithtable.lib;

import org.apache.logging.log4j.Level;

import com.gmail.rohzek.smithtable.ActuallyUsefulSmithingTable;


public class LogHelper 
{
	public static void Log(String message) 
	{
		ActuallyUsefulSmithingTable.LOGGER.log(Level.ALL, message);
	}
}
