package supperclasskeyword;

public class Sub extends Super {
String name1;
public int a = 9;

Sub(String name , String name1) {
		super(name);
	 name1 = name1;
	
	}
 void display() {
		System.out.println(super.a);
		System.out.println(name);
		System.out.println(name1);
	}

}
