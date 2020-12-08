package ControlStatement;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// Check whether an alphabet is vowel or consonant using switch statement
            System.out.println("Enter Alphabet");
            Scanner al = new Scanner(System.in);
            char alph = al.next().charAt(0);
            switch(alph) {
            case'a':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'e':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'i':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'o':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'u':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case's':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'A':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'E': 
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'I':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'O':
            	System.out.println("Alphabet is Vowel "+ alph);
    			break;
            case'S':System.out.println("Alphabet is Vowel "+ alph);
			    break; 
            	default:
            		System.out.println("Alhabet is Consonant");
            		
            	
            }
            


	}

}
