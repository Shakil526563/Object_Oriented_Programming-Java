package basicjava;

public class Area {
	public int length;
	public int breadth;
	
	public void setDim(int a,int b) {
		length=a;
		breadth=b;
	}
	
public int getArea()
	{
		int rectangle = length*breadth;
		return rectangle;
	}

	public static void main(String[] args) {
	Area rec =new Area();
	rec.setDim(6,5);
	
	System.out.println("Rectangle :"+rec.getArea());

	}

}
