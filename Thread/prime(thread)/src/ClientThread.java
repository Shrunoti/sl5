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
			String str1="";

			while(!str1.equals("stop"))
			{
				int n,m,i;
				int res=1;
				n=din.readInt();
				System.out.println("The number is:\n"+n);


				for(i=2;i<n;i++)
				{

					if(n%i==0)
					{
						res=0;

					}
				
				}
				//p=1;
				System.out.println("res is:\n"+res);
				dout.writeInt(res);
				dout.flush();
			}

			din.close();
			s.close();
		} catch (Exception e) {

		}

	}



}
