package hasmap;
import java.util.HashMap;
import java.util.Scanner;
public class HasMap {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Inter the key number : ");
		int a=input.nextInt();
HashMap<Integer,String> Student  = new HashMap<Integer,String>();
Student.put(101, "Shakil ");
Student.put(102,"Rasel");
Student.put(103, "Belal");
System.out.println(Student.get(a));

	}

}
