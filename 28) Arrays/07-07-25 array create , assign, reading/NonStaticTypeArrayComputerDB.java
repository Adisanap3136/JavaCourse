package arrays;


class Computer
{
	String name;
	double price;
	String procesor;
	int core;
	
	public Computer() {}

	public Computer(String name, double price, String procesor, int core) 
	{
		super();
		this.name = name;
		this.price = price;
		this.procesor = procesor;
		this.core = core;
	}

	@Override
	public String toString() 
	{
		return "Computer [name=" + name + ", price=" + price + ", procesor=" + procesor + ", core=" + core + "]";
	}
}

public class NonStaticTypeArrayComputerDB 
{
	public static void main(String[] args) 
	{
		Computer c[] = new Computer[3];
		c[0] = new Computer("Asus",48500.00,"Intel i5 RTX 2050",8);
		c[1] = new Computer("Dell",90000.00,"Intel i5 RTX 9050",8);
		c[2] = new Computer("Hp",30500.00,"Intel i5 RTX 2050",8);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
