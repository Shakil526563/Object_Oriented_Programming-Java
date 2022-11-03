package inheri;

public class Document {
private String AuthoreName;
private int date;
public String getAuthoreName() {
	return AuthoreName;
}
public void setAuthoreName(String authoreName) {
	AuthoreName = authoreName;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
Document(String AuthoreName,int date){
	this.AuthoreName=AuthoreName;
	this.date=date;
}
public void display() {
	System.out.println("Authore Name : "+AuthoreName);
	System.out.println("Date : "+date);
}

}
