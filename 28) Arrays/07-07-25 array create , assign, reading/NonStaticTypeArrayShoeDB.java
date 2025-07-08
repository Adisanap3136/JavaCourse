package arrays;

class Shoe
{
	String name;
	int price;
	String brand;
	int size;
	
	public Shoe() {}

	public Shoe(String name, int price, String brand, int size) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.size = size;
	}

	@Override
	public String toString() 
	{
		return "Shoe [name=" + name + ", price=" + price + ", brand=" + brand + ", size=" + size + "]";
	}
}

public class NonStaticTypeArrayShoeDB 
{
	public static void main(String[] args) 
	{
		Shoe s [] = new Shoe[3];
		s[0] = new Shoe("Sport",500,"Bata",6);
		s[1] = new Shoe("Sport",1600,"Puma",9);
		s[2] = new Shoe("Sport",1200,"RedTape",9);
		
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}
