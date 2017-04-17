

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
	
	public static void main(String[] args) throws RemoteException {
	
	revInterface stub = new reverse ();
	
	 try {
		Naming.bind("rmi://localhost:5001/reverse", stub);
	} catch (MalformedURLException | AlreadyBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	

}
