class ShoeDriver
{
	public static void main(String[] args)
	{
		Shoe s1 = new Shoe();
		s1.brand = "Puma";
		s1.show();
		s1.displayShoe();

		//Shoe s2 = new Shoe();
		//s1.displayShoe();
	}
}


//This is the non static initializer example
/*
ip input is NIKE : output
Nike
7000.0
0
null

----------------------------

if input is ADIDAS: output
ADIDAS
10000.0
0
null
*/