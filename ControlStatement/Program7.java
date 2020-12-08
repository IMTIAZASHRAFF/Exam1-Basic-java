package ControlStatement;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
/*7.Write a program using nested switch statement. Take input from user in form of “” 
      and print the current running movies at the theater. E.g.

Input : 1F output: “In fairfax cinemax currently running movie : thor”. Make up your own data.*/
        
		System.out.println("Enter the Cinema Location");
		Scanner sc = new Scanner(System.in);
         String cinema = sc.next();
         switch(cinema) {
         case"Fairfax":
         	System.out.println("Thor: "+ "Timing: 06:00am to 8:00am: "
         			+ "10:00am to 12:00pm: "
         			+ "02:00pm to 4pm: " + "Avangers: "+"Timing: 08:00am to 10:00am: "
         			+ "11:00am to 01:00pm: "
         			+ "02:00pm to 4pm:" );
 			break;
         case"Chantilly":
         	System.out.println("Thor: "+ "Timing: 06:00am to 8:00am: "
         			+ "10:00am to 12:00pm: "
         			+ "02:00pm to 4pm: " + "Avangers: "+"Timing: 08:00am to 10:00am: "
         			+ "11:00am to 01:00pm: "
         			+ "02:00pm to 4pm:");
 			break;
         case"Loudon":
         	System.out.println("Thor: "+ "Timing: 06:00am to 8:00am: "
         			+ "10:00am to 12:00pm: "
         			+ "02:00pm to 4pm: " + "Avangers: "+"Timing: 08:00am to 10:00am: "
         			+ "11:00am to 01:00pm: "
         			+ "02:00pm to 4pm:");
 			break;
         case"Silver Spring":
         	System.out.println("Thor: "+ "Timing: 06:00am to 8:00am: "
         			+ "10:00am to 12:00pm: "
         			+ "02:00pm to 4pm: " + "Avangers: "+"Timing: 08:00am to 10:00am: "
         			+ "11:00am to 01:00pm: "
         			+ "02:00pm to 4pm:");
 			break;
         default:
     		System.out.println("No movies shows");
         }
         
         
	}

}
