package encapsulation;

public class Capmain {

	public static void main(String[] args) {
Capsule acapsule = new Capsule();
acapsule.setName("Napa");
System.out.println("Name of medicine"+" " +acapsule.getName());
acapsule.setRate(500);
System.out.println("The rate of per capsulea"+" " +acapsule.getRate()+" "+"taka");
acapsule.setsickName("Fever");
System.out.println("Suffer to"+" " +acapsule.getsickName());


	}

}
