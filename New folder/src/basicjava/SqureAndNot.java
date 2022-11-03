package basicjava;

import java.util.Scanner;

public class SqureAndNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
int length;
System.out.print("Enter the length :");
length=input.nextInt();
int breadth;
System.out.print("Enter the breadth :");
breadth=input.nextInt();
if (length==breadth) {
	System.out.println("Square");
}
else {
	System.out.println("Not");
}
	}

}
