package net.playssa.awesomecore.mysql;

import net.playssa.awesomecore.AwesomeMessages;

public class AwesomeCoreMySQL
{
	String host, port, database, user, password;
	
	
	
	
	
	
	
	
	public boolean open()
	{
		if(init())
		{
			//String url = "jdbc:mysql://" + getHostname() + ":" + getPort() + "/" + getDatabase();
		}
		else
		{
			
		}
		
		
		
		return false;
	}
		
	public boolean init()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			return true;
		} catch (ClassNotFoundException e)
		{
			AwesomeMessages.consoleError("MySQL driver class missing: " + e.getMessage() + ".");
			return false;
		}
	}
}
