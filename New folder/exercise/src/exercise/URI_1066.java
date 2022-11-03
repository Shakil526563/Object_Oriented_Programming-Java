package exercise;

import java.util.Scanner;

public class URI_1066 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr=new int[5];
		int i,even=0,odd=0,pos=0,neg=0;
		for(i=0;i<5;i++) {
		
			arr[i]=input.nextInt();
		}
		 for (i= 0;i<5;i++) {
			 if(arr[i]%2==0) {
				 even++;
			 }
			 if(arr[i]%2!=0) {
				 odd++;
			 }
			  if(arr[i]>0) {
				 pos++;
			 }
			 if(arr[i]<0) {
				 neg++;
			 }
		 }
		 System.out.println(even+ " valor(es) par(es)");
		 System.out.println(odd+ " valor(es) impar(es)");
		 System.out.println(pos+ " valor(es) positivo(s)");
		 System.out.println(neg+ " valor(es) negativo(s)");
	}
	

}
