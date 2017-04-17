import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {

	public static void main(String[] args) {
		
		Client c=new Client();
		String name1,name2;
		double p;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			Registry r1=LocateRegistry.getRegistry("localhost",3909);
			DBInterface DI=(DBInterface)r1.lookup("DBServ");
			int ch=1;
			do{
				System.out.println("1.Enter Strings\n2.Enter Choice\n");
				ch=Integer.parseInt(br.readLine());
				switch(ch){
				case 1:
					System.out.println("Enter String1:\n");
					name1=br.readLine();
					System.out.println("Enter String2:\n");
					name2=br.readLine();
					p=DI.input(name1,name2);
					if(p==1)
					{
						System.out.println("String2 is reverse of string1");
					}
					else
					{
						System.out.println("String2 is not reverse of string1");
					}
					
					break;
					
					
				}
			}while(ch>0);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
