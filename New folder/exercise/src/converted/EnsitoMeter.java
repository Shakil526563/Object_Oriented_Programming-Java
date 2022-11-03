package converted;

import java.util.Scanner;

public class EnsitoMeter {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int E;
System.out.print("Enter the ensi amount :");

E = input.nextInt();
double M = E*0.0254;
System.out.println("Ensi to Meter :" +M);

	}

}
