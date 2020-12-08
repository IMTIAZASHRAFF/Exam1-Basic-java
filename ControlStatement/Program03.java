package ControlStatement;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int newnumber = sc.nextInt();
		int first = 0;
		int second = 1;
		for(int x=0;x<newnumber;x++) {
			int last = second;
			second = first;
			first = last+second;
			System.out.println(first);
		}

	}

}
