package converted;

import java.util.Scanner;

public class FartoCel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int F;
		System.out.print("Enter the fhrenheit temperature m:");
		F=input.nextInt();
		float c;
		c=(5*F -160)/(float)9;
		System.out.println("far to cel :"+c);

	}

}
