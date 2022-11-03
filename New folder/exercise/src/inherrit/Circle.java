package inherrit;

public class Circle extends Operation{
	double pi=3.1416;
	Operation o = new Operation();
	public int circle(int radius) {
	int result=o.Operation(radius);
	return (int) (pi*result);
	
	}
}
