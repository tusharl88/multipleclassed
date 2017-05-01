package multipleclassed;
import java.util.Scanner;

public class father {
	public static void main(String args[])
	{
		System.out.println("enter your name:");
		Scanner tushar= new Scanner(System.in);
		son obj= new son();
		String name = tushar.nextLine();
		
		obj.simpleMessage(name);
		
		
	}

}
