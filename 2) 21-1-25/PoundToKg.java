//21-01-2025 kokate sir> HW -> this program convert the pound to kg and one pound is 0.454 kilogram.

import java.util.Scanner;
class  PoundToKg
{
	public static void main(String[] args) 
	{
		//this is pound to kg.
		System.out.print("Enter Pound for conversion: ");
		float pound = new Scanner(System.in).nextFloat();
		float kg = 0.454f*pound;
		System.out.println("Pound is: "+pound+" in Kg: "+kg);

	//This is Kg to pound
		System.out.print("Enter Kg for conversion: ");
		float kiloGram = new Scanner(System.in).nextFloat();
		float pd = kiloGram /0.454f;
		System.out.println("in Kg: "+kiloGram+" in pd "+pd);
	}
}