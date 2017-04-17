import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

interface DBInterface extends Remote{
	public double input(String name1,String name2)throws RemoteException;
}
public class Server extends UnicastRemoteObject implements DBInterface {

	//String name3;
	double p;
	protected Server() throws RemoteException {
		super();
		try {
			System.out.println("Server is Initializing\n Server Ready..\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Server rs=new Server();
			java.rmi.registry.LocateRegistry.createRegistry(3909).rebind("DBServ",rs);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}

	}

	@Override
	public double input(String name1, String name2) throws RemoteException {
		// TODO Auto-generated method stub
		//int p;
		try {

			char[] letters1=name1.toCharArray();
			char[] letters2=name2.toCharArray();
			int count1=0,count2=0;
			for(char c:letters1)
			{
				switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count1++;
					break;
				}
			}
			for(char c:letters2)
			{
			 switch(c)
			 {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
				 count2++;
				 break;
			 }
			 if(count1==count2)
			 {
				 p=1;
			 }
			 else
			 {
				 p=0;
			 }
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}
		return p;
	}

}
