package employees;

public class Member {
	public String name;
	public int age;
	public String phoneNumber;
	public String Address;
	public int salary;
	public void printSalary(int salary)
	{
		System.out.println("Salary :"+salary);
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("agge:"+age);
		System.out.println("Phone number:"+phoneNumber);
		System.out.println("Address :"+Address);
		System.out.println("Salary :"+salary);

	}

}
