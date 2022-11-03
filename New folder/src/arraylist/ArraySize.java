package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraySize {

	public static void main(String[] args) {
ArrayList<Integer> input = new ArrayList<>();
input.add(3);
input.add(5);
input.add(6);
input.add(90);
input.add(3, 9);
//for each loop dia korte parbo.

Iterator  itr = input.iterator();

while(itr.hasNext())
		{		

System.out.println(" "+itr.next());

	}
//removing element of the array
//input.clear();
//System.out.println("number = " +input);
boolean ar = input.isEmpty();
System.out.println("Array list is empty : "+ar);
boolean contain = input.contains(5);
System.out.println("Yes contais 5 : "+contain);
input.set(2, 10);
System.out.println("number = " +input);
int index =  input.indexOf(90);
System.out.println("number of position = " +index);
int get = input.get(2);
System.out.println("number = " +get);
Collections.sort(input);
System.out.println("Assending order of array"+input);
Collections.sort(input,Collections.reverseOrder());
System.out.println("Desinding of array "+input);
input.remove(2);
System.out.println(input);
	}
}
