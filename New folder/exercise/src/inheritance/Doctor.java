package inheritance;

public class Doctor extends Students {
	
	String degree;
	String institude;
	

	Doctor(String name, int age, int id,String degree,String institude) {
		super(name, age, id);
		this.degree=degree;
this.institude=institude;
		
	}


	@Override
	void display() {
		
		super.display();
		System.out.println("Degree = "+degree);
		System.out.println("Institudee = "+institude);
		
	}

}
