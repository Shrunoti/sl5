import java.rmi.Remote;

import java.rmi.RemoteException;

public interface revInterface extends Remote {

	String rev(String name) throws RemoteException;

}
