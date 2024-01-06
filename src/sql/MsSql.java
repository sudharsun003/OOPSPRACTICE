package sql;

public class MsSql implements DataBase
{

	@Override
	public void connect() 
	{
     System.out.println("MYSQL IS CONNECTED");		
	}

	@Override
	public void disconnect() 
	{
      System.out.println("MYSQL IS DISCONNECTED");
	}
  
}
