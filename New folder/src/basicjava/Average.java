package basicjava;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
int[] arr = new int[10];
int sum=0;
float avg;
System.out.println("Enter  10 integer value");
for(int i = 0;i<10;i++) {
	arr[i]=input.nextInt();
	
}
for(int i=0;i<10;i++) {
	
	sum=sum+arr[i];

}
System.out.println("Summation ="+sum);
avg=(float)sum/10;
System.out.println("Average value ="+avg);
}
}