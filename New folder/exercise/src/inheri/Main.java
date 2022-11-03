package inheri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Authore name:");
		String name =input.nextLine();
		System.out.println("Enter date:");
		int date=input.nextInt();
		input.nextLine();
		System.out.println("Enter the book title:");
		String title=input.nextLine();
		System.out.println("Enter the book prize:");
		int prize=input.nextInt();
		input.nextLine();
		System.out.println("The name Subject ");
		String sub=input.nextLine();
		System.out.println("Enter thee email idd");
		String emailid=input.nextLine();

	Email a=new Email(name,date,title,prize,sub,emailid);
	a.display();

	}

}
