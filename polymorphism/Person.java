package polymorphism;

import java.util.Scanner;

public class Person {
	Scanner input =   new Scanner(System.in); 

	String name;

	int age;
	void display() {
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		
	}

}
