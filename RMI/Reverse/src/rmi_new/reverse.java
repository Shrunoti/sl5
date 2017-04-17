

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class reverse extends UnicastRemoteObject implements revInterface {

	protected reverse() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String rev(String name) {
		
		StringBuffer s= new StringBuffer(name);
		
		String rev;
		rev = s.reverse().toString();
		
		return rev;
	}

}
