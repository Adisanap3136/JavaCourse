package finalModifier;

public final class FinalClass 
{
//	we can make a class final, abstract , default 
//	we cannot inherit the final class
//	Ex: Scanner class, String class, all Wrapper class, StringBuilder class, StringBuffer class
	
	public static void main(String[] args)
	{
		FinalClass f = new FinalClass();
		System.out.println("secure class: "+f.getClass().getName());
	}
}


// if we try to inherit the final class we will get cte
//class child extends FinalClass
//{
//}


//we cannot make a class final abstract
/*
Abstract class: Meant to be extended by other classes.

Final class: Cannot be extended by other classes.

Incompatible: A class cannot be both abstract (intended to be extended) and final (cannot be extended) at the same time.
*/