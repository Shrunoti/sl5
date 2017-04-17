import java.io.*;
import java.net.*;

public class ClientThread implements Runnable {

	private Socket s;
	public ClientThread(Socket _s)
	{
		this.s = _s; 
	}
	public void run()
	{
		try
		{
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1="";
		String str2="";
		while(!str1.equals("stop"))
		{
			str1 = din.readUTF();
			System.out.println("Client "+ s.getPort()+ "says : "+str1);
			str2= br.readLine();
			dout.writeUTF(str2);
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