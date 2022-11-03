package findout;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int x;
		 int y; 
		 int z;
		 System.out.print("Enter the three number : ");
		 x = input.nextInt();
		 y = input.nextInt();
		 z = input.nextInt();
		 if (x>y&&x>z) {
			 System.out.println("large number is "+x);
		 }
		 else if(y>x&&y>z) {
			 System.out.println("large number is "+y);

		 }
		 else {
			 System.out.println("large number is  "+z);

		 }
		
		

	}

}
