package polymorphism;

public class Teacher extends Person {
	String quli;

	@Override
	void display() {
		 
		super.display();
		System.out.println(quli);
		
	}
	
	
}
