import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {

	
	public static void main(String[] args)throws Exception {
		
		Socket s=new Socket("localhost",4006);
		
		DataInputStream din =new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String str1="";
		
		while(!str1.equals("stop")){
			int n;
			int p=1;
			
			System.out.println("Enter the positive number:\n");
			n=Integer.parseInt(br.readLine());
			dout.writeInt(n);
			p=din.readInt();
			if(p==1)
			{
				System.out.println("The number is prime:\n");
			}
			else
			{
				System.out.println("The number is not prime:\n");
			}
					
		
		}
		dout.close();
		s.close();
		

	}

}
