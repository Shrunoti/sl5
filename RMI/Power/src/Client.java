import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {

	public static void main(String[] args) {
		
		Client c=new Client();
		int num1,num2;
		double p;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			Registry r1=LocateRegistry.getRegistry("localhost",3909);
			DBInterface DI=(DBInterface)r1.lookup("DBServ");
			int ch=1;
			do{
				System.out.println("1.Enter number\n2.Enter Choice\n");
				ch=Integer.parseInt(br.readLine());
				switch(ch){
				case 1:
					System.out.println("Enter num1:\n");
					num1=Integer.parseInt(br.readLine());
					System.out.println("Enter num2:\n");
					num2=Integer.parseInt(br.readLine());
					p=DI.input(num1,num2);
					System.out.println("result is :\n"+p);
					break;
					
					
				}
			}while(ch>0);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
