//20-01-2025 Q.Find the are of Circle and take user input. (Kokate sir)

import java.util.Scanner;
class AreaOfCrl 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		final float pie = 22/7;
		System.out.print("Enter the radius of Circle: ");
		float r = sc.nextFloat();

		float radius = pie * r * r;
		System.out.println("The radius os Circle is: "+ radius +"cm square");
	}
}