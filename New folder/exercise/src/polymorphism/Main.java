package polymorphism;

public class Main {

	public static void main(String[] args) {
		Overloading input = new Overloading();
		input.over(22, 66);
		
		input.over(66, 6, 99);
		
		input.over(22, 33.3);
		input.display();

		Teacher t = new Teacher();
		t.name="Shakil";
		t.age =21;
		t.quli =" Bsc";
		t.display();
		Person p = new Person();
		p.name="Naim";
		p.age =44;
		p.display();
		
	}

}
