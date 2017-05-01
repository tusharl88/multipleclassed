
package multipleclassed;

import java.util.Scanner;

public class father1 {
	public static void main(String args[])
{
	System.out.println("enter your mother name:");
	Scanner tushar= new Scanner(System.in);
	son1 obj= new son1();
	String temp = tushar.nextLine();
	
	obj.simpleMessage(temp);
	obj.getname();
	obj.saying();
	
	
}

}



