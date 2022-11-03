package polymorphism;

public class Overloading {
	int sum=0;
	int pro=0;
	double div=0;
	public  void over (int a, int b) {
		 sum = a+b;
		
	}
	public void over (int a,int b,int c) {
		 pro = a*b*c;
		
	}
	public void over (int a,double b)
	{
		 div = (float)a/b;
	}
	public void display() {
		System.out.println("Sum = "+sum);
		System.out.println("Product = "+pro);
	System.out.println("Divided ="+div);
		
	}
}
