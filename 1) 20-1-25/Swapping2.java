//20-01-2025 HW Q.Swap the element without third variable. (Kokate sir)

class Swapping2
{
	public static void main(String[] args) 
	{
		System.out.println("Before Swapping: ");
		int a = 15;
		int b = 6;
		int temp;
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);

		System.out.println("After Swapping: ");
		temp = b;       //here we store the b into temp variable.
		b = a;          //Now, a will store into the b variable.
		a = temp;       //and at the end temp data store into the a variable.
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
	}
}