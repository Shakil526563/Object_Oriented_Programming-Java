package converted;

import java.util.Scanner;

public class MintoYearday {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int min,Y,day;
System.out.print("input for minutes:");
min=input.nextInt();
Y=min/525600;
min=min%525600;
day=min/1440;
System.out.println("Year :" +Y+ " Day:"+day);

	}

}
