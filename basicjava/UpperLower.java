package basicjava;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
char ch;
System.out.print("Enter the charecter :");
ch=input.next().charAt(0);
if(ch>='a'&& ch<='z') {
	System.out.print(ch+" is lower case");
}
else if(ch>='A'&&ch<='Z') {
	System.out.println(ch+ " is Upper case");
}
else {
	System.out.println("Charecter is not found");
}

	}

}
