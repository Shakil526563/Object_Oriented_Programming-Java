package poly;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
        Animal b=new Pig();
        Animal c=new Dog();
        a.animalsound();
        b.animalsound();
        c.animalsound();
        Add ad=new Add();
       System.out.println("ADD :"+ ad.add(8, 6));
       System.out.println("ADD :"+ ad.add(2.3, 6.5));

	}

}
