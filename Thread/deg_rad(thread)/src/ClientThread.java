import java.io.*;
import java.net.*;
import java.lang.Math;

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
		double no1,no2,res;
		String str1="";
		while(!str1.equals("stop"))
		{
			no1 = din.readDouble();
			
			res=Math.toRadians(no1);

			dout.writeDouble(res);
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