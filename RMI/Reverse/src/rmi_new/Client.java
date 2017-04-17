

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class Client {
	static String name;
	
	public static void main(String[] args) throws IOException, NotBoundException
	{
		  BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		  
		  String result;
		  
		  System.out.println("Enter String");
		  
		  name = bf.readLine();
		  
		  revInterface stub = (revInterface) Naming.lookup("rmi://localhost:5001/reverse");
		  
		  result = stub.rev(name);
		  
		  System.out.println (result);
		  
		  
	}

}
