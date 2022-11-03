package inheritance;

public class Students extends Person {
	int id;
	Students(String name, int age,int id) {
		super(name, age);
		this.id=id;
		
	}
	@Override
	void display() {
		super.display();
		System.out.println("Id = "+id);
	}

	

}
