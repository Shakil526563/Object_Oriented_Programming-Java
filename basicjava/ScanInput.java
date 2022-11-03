package basicjava;

import java.util.Scanner;

public class ScanInput {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	String name;
	System.out.print("Enter your name :");
	name=input.nextLine();
	int roll;
	System.out.print("Enter your roll:");
	roll=input.nextInt();
	String inter;
	input.nextLine();
	System.out.println("Enter your field of interest :");
	inter=input.nextLine();
	System.out.println("Hey,my name is " +name + "and my roll number is " +roll+ " My field of interest  are" +inter);
	

	}

}
