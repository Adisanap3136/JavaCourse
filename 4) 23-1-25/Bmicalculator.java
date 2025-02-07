import java.util.Scanner;
class Bmicalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in pound: ");
		float pound = sc.nextFloat();
		System.out.print("Enter height in inches: ");
		float height = sc.nextFloat();

		float weight = pound * 0.45359237f;
		float inches = height * 0.0254f;
		float BMIi = weight / (inches*inches);

		System.out.println("BMI is : "+BMIi);
	}
}