package encapsulation;

public class Capsule {
	private String name;
	private int rate;
	private String forSick;
	public void setName(String name) {
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getRate() {
		return rate;
	}
	public void setsickName(String forsick) {
		forSick = forsick;
	}
	public String getsickName() {
		return forSick;
	}

}
