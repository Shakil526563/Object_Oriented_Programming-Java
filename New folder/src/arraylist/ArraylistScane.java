package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistScane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new  ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the five value");
		for(int i=0;i<5;i++) {
			number.add(input.nextInt());
		}
		
System.out.println(number);
	}

}
