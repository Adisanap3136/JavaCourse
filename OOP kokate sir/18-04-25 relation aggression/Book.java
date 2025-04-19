package principleOfOop.Shrikantsir;

public class Book {
	String type;
	String brand;
	String sub;
	int pages;
	double price;
	
	public Book(String type, String brand, String sub, int pages, double price) {
		this.type = type;
		this.brand = brand;
		this.sub = sub;
		this.pages = pages;
		this.price = price;
	}
	 
	public void displayBook()
	{
		System.out.println("Book details");
		System.out.println("Type: "+type);
		System.out.println("Brand: "+brand);
		System.out.println("Subject: "+sub);
		System.out.println("Pages: "+pages);
		System.out.println("Price: "+price);
		System.out.println();
	}
	
}
