package abstracts2;

public class Main {

	public static void main(String[] args) {
		Shape shape;
		shape = new Rectanghular(5,5);
		shape.area();
		
		shape = new Triangle(8,5);
		shape.area();
		shape = new Circle(8);
		shape.area();
		
	}

}
