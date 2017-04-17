import java.net.ServerSocket;
import java.net.Socket;




public class Server {

	static ServerSocket ss;
	static Socket s;
	static int i;

	public static void main(String[] args)throws Exception {

		ss=new ServerSocket(4006);
		int i=1;
		System.out.println("Initializing Server\n Server is ready... ");
		while(true){

			try {
				s=ss.accept();
				
				if(s!=null)
				{
					new Thread(new ClientThread(s)).start();
					System.out.println("Creating thread number:\n"+i);
					i++;
				}
				else
				{
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}


		}

	}

}
