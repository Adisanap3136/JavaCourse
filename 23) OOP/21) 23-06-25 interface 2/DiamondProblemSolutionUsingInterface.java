package principleOfOop.Interface;

interface Father
{
	int mark=80;
	void degree();
	static void msg()
	{
		System.out.println("Jeete Raho");
	}
}
interface Mother
{
	int mark=90;
	void degree();
	static void msg()
	{
		System.out.println("Kahyal Rakho");
	}
}
class Son implements Father,Mother
{
	public Son() {System.out.println("Son----------------------------------------------- class");}  //calling supercall to object class constructor
	
	public void degree()
	{
		System.out.println("Bachelors Of Arts");
//		System.out.println("marks: "+mark);        //The field mark is ambiguous because if we have same variable in both interface
	}
}

public class DiamondProblemSolutionUsingInterface 
{
	public static void main(String[] args)
	{
		Father f = new Son();
		f.degree();
//		f.msg();  //This static method of interface Father can only be accessed as Father.msg
		Father.msg();     //this is how we call the static method of interface
		System.out.println(f.mark);
		System.out.println(Father.mark);
		
		Mother m = new Son();
		m.degree();
//	  	m.msg();	//	This static method of interface Mother can only be accessed as Mother.msg
		Mother.msg();     //this is how we call the static method of interface
		System.out.println(m.mark);
		System.out.println(Mother.mark);
	}
}
