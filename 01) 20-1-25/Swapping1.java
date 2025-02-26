//20-01-2025 Q.Swap the element without using third variable. (Kokate sir)

class Swapping1
{
	public static void main(String[] args) 
	{
		System.out.println("Before Swapping: ");
		int a = 10;
		int b = 11;
		System.out.println(a);
		System.out.println(b);

		System.out.println("After Swapping: ");
		a = a + b;     // 10 + 11 = a->21
		b = a - b;     // 21 - 11 = b->10
		a = a - b;     // 21 - 10 = a->11
		System.out.println(a);
		System.out.println(b);
	}
}