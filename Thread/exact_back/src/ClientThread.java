import java.io.*;
import java.net.*;

public class ClientThread implements Runnable {

	private Socket s;
	public ClientThread(Socket _s)//constructor
	{
		this.s = _s; 
	}
	public void run()//run method for runnable
	{
		try
		{
		DataInputStream din = new DataInputStream(s.getInputStream());//read data from client
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());//five data to client
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1="";
		String str2="";
		while(!str1.equals("stop"))
		{
			str1 = din.readUTF();//read hello from client
			System.out.println("Client "+ s.getPort()+ "says : "+str1);
			dout.writeUTF(str1);
			dout.flush();
		}
		din.close();
		s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}