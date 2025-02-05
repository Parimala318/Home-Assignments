package Week2.Day4.Assignment;

public class DatabaseConnClass implements DatabaseConnection
{
	@Override
	public void connect()
	{
		System.out.println("Connect to the DB");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("Disconnect from the DB");
		
	}

	@Override
	public void executeUpdate()
	{
		System.out.println("Execute DB update");
		
	}
	
	public static void main(String[] args) 
	{
		DatabaseConnClass conn=new DatabaseConnClass();
		conn.connect();
		conn.disconnect();
		conn.executeUpdate();

	}

}
