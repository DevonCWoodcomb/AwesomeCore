package net.playssa.awesomecore;

import lombok.Getter;

import org.bukkit.Bukkit;

public class AwesomeSettings
{
	@Getter
	private static boolean usingBans, usingChat;
	
	
	
	
	public static void init()
	{
		usingBans = Bukkit.getPluginManager().isPluginEnabled("AwesomeBans");
		usingBans = Bukkit.getPluginManager().isPluginEnabled("AwesomeChat");
	}
	
	public static void loadSettings()
	{
		
	}
	
	
	public static String colorize(String s)
	{
	    if(s == null) 
	    	return null;
	    return s.replaceAll("&([0-9a-f])", "\u00A7$1");
	}
}
