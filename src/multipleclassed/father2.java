package multipleclassed;

import java.util.Scanner;

public class father2 {
	public static void main(String args[])
	{
		System.out.println("enter your mother name:");
		
		Scanner tushar= new Scanner(System.in);
		
	
		String temp = tushar.nextLine();
		son2 obj= new son2(temp);
		
		
		obj.saying();
		
	}
}