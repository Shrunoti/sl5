import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {

	
	public static void main(String[] args)throws Exception {
		
		Socket s=new Socket("localhost",4003);
		
		DataInputStream din =new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String str1="",str2="",str3="";
		
		while(!str1.equals("stop")){
			
			System.out.println("Enter the First String:\n");
			str1=br.readLine();
			System.out.println("Enter the Second string:\n");
			str2=br.readLine();
			dout.writeUTF(str1);
			dout.writeUTF(str2);
			
			str3=din.readUTF();
			System.out.println("The result is:\n"+str3);
			
		
		}
		dout.close();
		s.close();
		

	}

}
