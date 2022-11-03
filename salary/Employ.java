package salary;

public class Employ {
	String name;
	int salary;
	int hour;
	String email;
	String degenitation;
	String addres;
	int tbase=0; 
	int Lsalary=0;
	
	
	public void getinfo(int salary,int hour) {
		this.salary=salary;
		this.hour=hour;
	}
public int addsal(int salary) {
	if(salary<=500) {
		
		tbase=salary+10;
		System.out.println("Manager salary "+tbase);
		return tbase;
		
	}
	else {
		System.out.println("Manager salary "+salary);
	}
	return salary;
}
	public int  addwork(int hour,int salary) {
		if(hour>=6) {
			 Lsalary = salary + 5;
			System.out.println("Laboureee salary "+Lsalary);
		}
		else {
			System.out.println("labour salary "+salary);
		}
		return hour;
	}
	
}

