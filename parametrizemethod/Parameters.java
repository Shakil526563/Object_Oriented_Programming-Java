package parametrizemethod;

public class Parameters {
	public String name;
	public String colour;
	public int number;
	public String test;
	public void setinfo(String a,String b,int c,String d) {
		name = a;
		colour =b;
		number =c;
		test=d;
		
	}
	public  void display() {
		
		System.out.println("Name of fruit :"+name);
		System.out.println("Name of colour :"+colour);	
		System.out.println("Totall amount of vitami :;"+number);
		System.out.println("How is that test :"+test);
		
	}
	
	

}
