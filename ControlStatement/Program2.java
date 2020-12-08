package ControlStatement;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		/*Take a number from user and Print if the number is less than 200 and even number otherwise 
		   print invalid number using Logical Operator*/
		System.out.println("Enter the number");
		Scanner j = new Scanner(System.in);
		int num = j.nextInt();
		
		if((num<200)&&(num%2==0)) {
			System.out.println("Less then 200 and even");
		}
		else if ((num<200)&&(num%2==1)){
			System.out.println("Less then 200 but invalid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
