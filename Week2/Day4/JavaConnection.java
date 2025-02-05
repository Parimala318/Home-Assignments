package Week2.Day4.Assignment;

public class JavaConnection extends MySQLConnection
{

	@Override
	public void connect() 
	{

		System.out.println("Connect to JAVA ");
		
	}

	@Override
	public void disconnect()
	{
		System.out.println("Disconnect from JAVA");
		
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("Execute JAVA");
	}

	public static void main(String args[]) 
	{
	JavaConnection javacon=new JavaConnection();
	javacon.connect();
	javacon.disconnect();
	javacon.executeUpdate();
	javacon.executeQuery();
	}
}
