class BookDriver
{
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.brand ="Classmate";
		b1.price = 50;
		b1.noOfPages = 100;
		b1.wt = 100;
		b1.type = "Story";
		b1.bound = "Soft bound";

		System.out.println("b1.brand: "+b1.brand);
		System.out.println("b1.price: "+b1.price);
		System.out.println("b1.noofpages: "+b1.noOfPages);
		System.out.println("b1.wt: "+b1.wt);
		System.out.println("b1.type: "+b1.type);
		System.out.println("b1.bound: "+b1.bound);
		System.out.println("--------------------------------------");

		Book b2 = new Book();
		System.out.println("b2.brand: "+b2.brand);
		System.out.println("b2.price: "+b2.price);
		System.out.println("b2.noofpages: "+b2.noOfPages);
		System.out.println("b2.wt: "+b2.wt);
		System.out.println("b2.type: "+b2.type);
		System.out.println("b2.bound: "+b2.bound);

/*
b1.brand: Classmate
b1.price: 50.0
b1.noofpages: 100
b1.wt: 100
b1.type: Story
b1.bound: Soft bound
--------------------------------------
b2.brand: null
b2.price: 0.0
b2.noofpages: 0
b2.wt: 0
b2.type: null
b2.bound: null
*/

		System.out.println("--------------------------------------");

		Book b3 = new Book();
		Book b4 = new Book();
		Book b5 = new Book();
		Book b6 = new Book();
		Book b7 = new Book();
		Book b8 = new Book();
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println("--------------------------------------");

/*
Book@15db9742
Book@6d06d69c
Book@7852e922
Book@4e25154f
Book@70dea4e
Book@5c647e05
*/

	}
}