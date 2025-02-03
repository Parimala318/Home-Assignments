package Week2.Day3.Assignment;

public class APIClient 
{
	
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus)
	{
		System.out.println(endpoint + requestBody + requestStatus);
	}

	public static void main(String args[])
	{
		APIClient client=new APIClient();
		client.sendRequest("test");
		client.sendRequest("endpoint","requestBody", true);
	}
	
}
