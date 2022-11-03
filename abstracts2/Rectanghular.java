package abstracts2;

public  class Rectanghular extends Shape {
		
	Rectanghular(double a, double b) {
		super(a, b);
		
	}

	void area() {
	
		double result = a*b;
		System.out.println("Rectanghular = "+result);
		
	}

}
