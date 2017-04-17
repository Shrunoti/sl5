import java.net.*;

public class Server {

	static ServerSocket ss;
	static Socket s;
	static int i=1;
	 
	public static void main(String args[])throws Exception
	{
		ss = new ServerSocket(5000);
		System.out.println("Server running on port 5000...");
		while(true)
		{
			try
			{
				s=ss.accept();
				if(s!=null)
				{
					new Thread(new ClientThread(s)).start();
					System.out.println("Created thread for client " + (i+1) + "...");
					i++;
					
				}
				else
				{
					break;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
}