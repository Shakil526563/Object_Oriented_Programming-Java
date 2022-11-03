package inheri;

public class Email extends Book {
	String sub;
	String emailID;

	Email(String AuthoreName, int date, String title, int prize,String sub,String emailID) {
		super(AuthoreName, date, title, prize);
		this.sub=sub;
		this.emailID=emailID;
	}

	@Override
	public void display() {
		
		super.display();
		System.out.println("Subject Name : "+sub);
		System.out.println("EmailID :"+emailID);
	}
	

}
