package diagram;

public class Student extends Person {

	Student(String name, String phone) {
		super(name, phone);
		
	}
	private String id;
	private double CGPA;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	protected Student (String id, double cGPA){
		this.id = id;
		CGPA = cGPA;
		
	}
}
