
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConcateInterface extends Remote {
	
	

	String concateString(String name1, String name2) throws RemoteException;

}
