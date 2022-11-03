package employees;

public class Main {

	public static void main(String[] args) {
	Employee input = new Employee();
	input.printSalary(500); 
	System.out.println(" ");
	
	input.name="shakil";
	input.age=19;
	input.Address="khubjipur";
	input.phoneNumber="01744586365";
	input.salary=500;
	input.setSpecialization("valo silai jane");
	System.out.println("Information for Employee");
	input.display(); 
	System.out.println(" ");
	System.out.println("Information for Manager");
	Manager input1 = new Manager();
	input1.name="shajal";
	input1.age=20;
	input1.Address="khubjipur";
	input1.phoneNumber="01744586365";
	input1.salary=5000;
	input1.setDepartment("product manager");
	
	input1.display();
	
	}

}
