package scane;
import java.util.Scanner;
public class ScannerALL {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("input a integer number  :");
		a = input.nextInt();
		
		float b;
		System.out.print("input the the float number :");
		b = input.nextFloat();
		
		double c;
		System.out.print("input the double number :");	
		c = input.nextDouble();
		input.nextLine();
	
		String name;
		System.out.print("input your name :");
		name = input.nextLine();
	
		char d;
		System.out.print("input your charecter:");
		d = input.next().charAt(0);
		
		System.out.println();
		System.out.println("integer number :"+a);
		System.out.println("Float number :"+b);
		System.out.println("Double number :"+c);
		System.out.println("Name :"+name);
		System.out.println("Charecter :"+d);

	}

}
