package basicjava;

import java.util.Scanner;

public class SumProd {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 1st number:");
	int a=input.nextInt();
	System.out.print("Enter 2nd number:");
	int b=input.nextInt();
	int sum=a+b;
	System.out.println("Summation =" + sum);
	int prod=a*b;
	System.out.println("Product = "+prod);

	}

}
