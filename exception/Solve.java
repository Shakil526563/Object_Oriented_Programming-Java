package exception;

import java.util.Scanner;

public class Solve {
	

	public static void main(String[] args) {
		int count=1;
		do { 
	try {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a = input.nextDouble();
		System.out.println("Enter the Second number");
		double b = input.nextDouble();
		double result = a/b;
		count=2;
		System.out.println("Result "+result);

	}catch(Exception d) {
		System.out.println(d);
	}
	}	while(count==1) ;
			
		
	}
}
