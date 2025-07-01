package principleOfOop.Interface;

interface Shape
{
	float pi = 22.0f/7.0f;
	void areOfSquare(int side);
	void areaOfPerimeter(int side);
	void areaOfCircel(int radius);
	static void shapes()
	{
		System.out.println("shape static method...");
	}
}

class ShapeImplementation implements Shape
{
	@Override
	public void areOfSquare(int side)
	{
		System.out.println(side*side);
	}
	@Override
	public void areaOfPerimeter(int side)
	{
		System.out.println(side*4);
	}
	@Override
	public void areaOfCircel(int radius)
	{
		System.out.println(2*pi*(radius*radius));
	}
}


public class ShapeDriver 
{
	public static void main(String[] args) 
	{
		Shape s = new ShapeImplementation();
		Shape.shapes();       //we call static method using interface as a reference
//		s.shapes();          //we cannot call interface static method using object reference
		s.areaOfCircel(10);
		s.areaOfPerimeter(4);
		s.areOfSquare(10);
	}
}
