package converted;

import java.util.Scanner;

public class SumofDigite {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n,r,sum=0;
	System.out.print("Enter the number :");
	n=input.nextInt();
	int tem;
	tem=n;
	while(tem!= 0){
		r=tem%10;
		sum=sum+r;
		tem=tem/10;
		
	}
System.out.println("Sum of digite :"+sum);
	}

}
