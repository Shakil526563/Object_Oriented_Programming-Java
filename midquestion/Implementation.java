package midquestion;

public class Implementation {
	public String name;
	public String email;
	public String address;
	public String designation;
	public int salary = 0;
	public int hour=0;
	 
	public void getinfo(int salary,int hour) {
		this.salary=salary;
		this.hour=hour;
		
	}
	public int AdSal() {
		if(salary<500){
			salary = salary+10;
			
		}
		else {
			salary = salary;
		}
		return salary;
	}
	public int AddWork() {
		if(hour>6) {
		salary =salary+ 5;
		
			
		}
		else {
			salary = salary;
		}
		return salary;
	}
	
		

}
