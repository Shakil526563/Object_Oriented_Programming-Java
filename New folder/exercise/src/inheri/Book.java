package inheri;

public class Book extends Document {
String title;
int prize;
	Book(String AuthoreName, int date,String title,int prize) {
	
		super(AuthoreName, date);
		this.title=title;
		this.prize=prize;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		
		super.display();
		System.out.println("Book title : "+title);
		System.out.println("Prize :"+prize);
	}
	
	

}
