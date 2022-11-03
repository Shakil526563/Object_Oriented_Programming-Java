package inherrit;

public class Main {

	public static void main(String[] args) {
	Email input = new Email();
	input.setAuthors("shakil");
	System.out.println("Author name : "+input.getAuthors());

	input.setTo("3");
	System.out.println("Date :"+input.getTo());
	input.setTitle("bio");
	System.out.println("Title name : "+input.getTitle());
	input.setSubject("application to holiday");

	System.out.println("Subject name :"+input.getSubject());
	input.setTo("shakil@gamil.com");
	System.out.println("To : "+input.getTo());
	

	Circle  v=new Circle();
	int result=v.circle(5);
	System.out.println("Result "+result);

	

	}

}
