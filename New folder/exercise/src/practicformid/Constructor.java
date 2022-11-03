package practicformid;

public class Constructor {
	private String name;
	private int id;
	private String dep;
	Constructor (String name,int id , String dep){
		this.name = name;
		this.id = id;
		this.dep = dep;
	}
	


public void display () {
	System.out.println("Name : "+name);
	System.out.println("Id : "+id);
	System.out.println("department : "+dep);

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
}
