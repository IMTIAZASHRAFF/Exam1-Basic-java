package ControlStatement;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		/*Take input from the user and Print if the number is less than 
		  or greater than 100 using Ternary Operator*/
		System.out.println("Enter the number");
		Scanner j = new Scanner(System.in);
		int num = j.nextInt();
		String res = num > 100 ? "Number is greater than 100" : 
			  num < 100 ? "Number is less than 100":"Number is equal to 100";
		System.out.println( res);
	}

}
