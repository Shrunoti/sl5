import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientThread implements Runnable{

	private Socket s;
	public ClientThread(Socket s1) {
		
		this.s=s1;
		
	}
	@Override
	public void run() {
		
	 try {
		
		 DataInputStream din=new DataInputStream(s.getInputStream());
		 DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String str1="",str2="",str3="";
		
		 while(!str1.equals("stop")){
			 
			
			 str1=din.readUTF();
			 System.out.println("The First String is:\n"+str1);
			 str2=din.readUTF();
			 System.out.println("The Second String is:\n"+str2);
			 str3=str1.concat(str2);
			 System.out.println("result is:\n"+str3);
			 dout.writeUTF(str3);
			 dout.flush();
		 }
		 
	} catch (Exception e) {
		
	}
		
	}
	
	

}
