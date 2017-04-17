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
	public double input(String name1,String name2) throws RemoteException {
		// TODO Auto-generated method stub
		//int p;
		try {
			StringBuffer Buffer1=new StringBuffer(name1);
			StringBuffer Buffer2=new StringBuffer(name2);
			
			Buffer1.reverse();
			System.out.println(Buffer1);
			System.out.println(Buffer2);
			
			if(Buffer1.toString().equals(Buffer2.toString())){
				p=1;
			}
			else
			{
				p=0;
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}
		return p;
	}

}
