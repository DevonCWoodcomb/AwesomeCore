package net.playssa.awesomecore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class AwesomeMessages
{
	ChatColor primaryTagColor, secondaryTagColor, PunishmentTagColor, errorTagColor;
	ChatColor primaryMessageColor, secondaryMessageColor, PunishmentMessageColor, errorMessageColor;
	
	
	
	//sends the formatted message to all players
	public static void broadcast(String message)
	{
		for(Player p : Bukkit.getOnlinePlayers())
		{
			p.sendMessage(message);
		}
	}
	
	//Sends the formatted message to all players with the given permission
	public static void broadcast(String message, String permission)
	{
			
	}
	
	//Sends the formatted message to the player
	public static void message(String message, Player player)
	{
		
	}
	
	//returns a message formatted as an error message
	public static String errorMessage(String message)
	{
		return message;
	}

	//formats a string as an error for console and player and then does shit with it
	public static void error(String string)//doesn't this need a player then?!?! if it has a player send to both if not just console?
	{
		consoleError(string); 
	}

	//formats a string as an error for the console and then does shit with it
	public static void consoleError(String string)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
