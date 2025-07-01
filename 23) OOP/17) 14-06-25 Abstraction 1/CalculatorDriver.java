package principleOfOop.Abstraction;

class CalculatorImplement extends Calculator
{
	public void addition(int a, int b) 
	{
		System.out.println("Result is: "+a+" + "+b+" = "+(a+b));
	}

	public void subtraction(int x, int y) 
	{
		System.out.println("Result is: "+x+" - "+y+" = "+(x-y));
	}

	public void multiplication(int m, int n) {
		System.out.println("Result is: "+m+" * "+n+" = "+(m*n));
	}
}

public class CalculatorDriver 
{
	public static void main(String[] args) 
	{
		Calculator cal = new CalculatorImplement();
		cal.addition(5, 5);
		cal.subtraction(5, 5);
		cal.division(5, 5);
		cal.multiplication(5, 5);
	}
}
