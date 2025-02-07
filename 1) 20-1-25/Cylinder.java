//20-01-2025 HW Q.Find the voloume of the cylinder. (Kokate sir)

import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of a cylinder: ");
		float radius = sc.nextFloat();

		System.out.print("Enter the height of a cylinder: ");
		float height = sc.nextFloat();

		float area = 3.14f * radius * radius;
		float volume  = area * height;

		System.out.println("The area is: "+area);
		System.out.println("The volume is: "+volume);
	}
}