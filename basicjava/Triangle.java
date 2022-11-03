package basicjava;

public class Triangle {
	public int a;
	public int b;
	public int c;
	
	Triangle(int i,int j,int k){
		a=i;
		b=j;
		c=k;
		
	}
public void trangleArea() {
	
   float s = a+b+c/2;
	double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area of Triangle :" +area);
	
}
	

	public static void main(String[] args) {
		Triangle rect=new Triangle(3,4,5);
		rect.trangleArea();

	}

}
