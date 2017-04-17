

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class server {
	
	public static void main(String[] args) throws RemoteException{
		try {

			
		ConcateInterface stub= new concate();
			
		
			Naming.rebind("rmi://127.0.0.1:5001/concate",stub);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
