//20-01-2025 HW Q.Convert celsius to fahrenheit . (Kokate sir)

import java.util.Scanner;
class Fahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a degree in Celsius: ");
		double celcius = sc.nextDouble();
		
		double fahrenheit = (9.0/5) * celcius +32;
		System.out.println(celcius +" Degree is in : "+fahrenheit+" fahrenheit");
	}
}