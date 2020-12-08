package ControlStatement;

public class program3 {

	public static void main(String[] args) {
/*Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt*/
		/*int maximum = Integer.parseInt(args[15]);
		int Firstnum = Integer.parseInt(args[0]);
		int Secondnum = Integer.parseInt(args[1]);*/
    int maximum = 15;
    int Firstnum = 0;
    int Secondnum = 1;
    System.out.println("Fibonacci series of " + maximum + " number: ");
    for (int i = 1; i<=maximum; i++) {
    	System.out.println(Firstnum+"");
    	int sum = Firstnum + Secondnum;
    	Firstnum=Secondnum;
    	Secondnum = sum;
    	
    }
	}

}
