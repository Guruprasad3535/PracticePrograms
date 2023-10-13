package CollectionClasses;

public class Book {
	
	String b_name;
	String b_author;
	int b_id;
	double b_price;
	
	
	public Book(String b_name,String b_author,int b_id,double b_price)
	{
		this.b_name=b_name;
		this.b_author=b_author;
		this.b_id=b_id;
		this.b_price=b_price;
	}


	@Override
	public String toString() {
		
		return "Book [ Book name: "+b_name+", Book author: "+b_author+", Book ID: "+b_id+", Book Price: "+b_price+" ]";
	}
	
    
}
