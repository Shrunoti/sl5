import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

interface DBInterface extends Remote{
	public double input(int num1,int num2)throws RemoteException;
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
	public double input(int num1, int num2) throws RemoteException {
		// TODO Auto-generated method stub
		//int p;
		try {
			p=Math.pow(num1, num2);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error:"+e.getMessage());
		}
		return p;
	}

}
