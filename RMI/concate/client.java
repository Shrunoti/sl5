
import java.io.*;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
public class client {
	
	static String name1, name2;
	static String name3;
	
	public static void main(String[] args){
		try{
	 
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
    System.out.println("Enter name1 and name2");
    name1 = bf.readLine();
    name2 = bf.readLine();
	ConcateInterface stub = (ConcateInterface)Naming.lookup("rmi://192.168.0.107:5001/concate");
	name3 = stub.concateString(name1, name2);
	System.out.println(name3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
