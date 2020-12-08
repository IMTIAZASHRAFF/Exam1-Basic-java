package ControlStatement;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		//Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
		System.out.println("Enter the bill amount");
		Scanner j = new Scanner(System.in);
		float num = j.nextInt();
		System.out.println("Enter tip percentage");
		float per = j.nextInt();
		float tip = (num*per/100);
		float totalbill = num+tip;
		System.out.println("Tip amount"+tip);
		System.out.println("Total amount "+ totalbill);
	}

}
