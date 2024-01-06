package sql;

public class Oracle implements DataBase
{

	@Override
	public void connect() 
	{
	
		System.out.println("ORACLE IS CONNECTED");
	}

	@Override
	public void disconnect() 
	{
	System.out.println("ORACLE IS DISCONNECTED");
		
	}
 
}
