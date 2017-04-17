

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
@SuppressWarnings("serial")
public class concate extends UnicastRemoteObject implements ConcateInterface{
	
	String name3;

	protected concate() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String concateString(String name1, String name2) throws RemoteException {
		// TODO Auto-generated method stub
		
		name3 = name1.concat(name2);
		return name3;
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("Concatenating");
//		
//	}
	

}
