import java.io.*;
import java.net.*;

public class Client {

	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("127.0.0.1",5000);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double no1,res;
		String str1="";
		while(!str1.equals("stop"))
		{
			System.out.println("Enter Number in Feets ::");
			no1=Double.parseDouble(br.readLine());			
			
			dout.writeDouble(no1);
			
			dout.flush();
			res=din.readDouble();
			System.out.println("Server says : "+res);
		}
		dout.close();
		s.close();
	}
}