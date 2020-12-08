package ControlStatement;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		/* Take a year as input and Print the year is leap year or
		  not a leap year using Nested-if else statement*/
		System.out.println("Enter the year");
          Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
           if(num%4==0) {
        	   System.out.println("Its a leap year");
        	   if(num%100==0) {
        		   System.out.println("Its a leap year");
        		   if(num%400==0) {
        			   System.out.println("Its a leap year");
        		   }
        	   }
           }
           else {
        	   System.out.println("Its not leap year");
           }
	}

}
