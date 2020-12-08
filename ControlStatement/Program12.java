package ControlStatement;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		/* .By using do while loop, write Java program to prompt the user to choose the correct 
		     answer from a list of answer choices of a question.*/
            System.out.println("What is the command keyword to exit a loop in Java?");
            System.out.println("a.quit");
            System.out.println("b.continue");
            System.out.println("c.break");
            System.out.println("d.exit");
            Scanner sc = new Scanner(System.in);
            char x = sc.next().charAt(0);
            
			do {
				
            	if(x=='c') {
            		System.out.println("Congratulations");
            		
            		continue;
            		
            	}
            	
            	else {
            		System.out.println("Incorrect");
            		
            		}
            	System.out.print("Again? press y to continue:");
            	x=sc.next().charAt(0);
            	
            }while (x<=10);
			
	}

}
