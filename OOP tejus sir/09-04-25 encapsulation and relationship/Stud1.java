package principleOfOop;

public class Stud1 {
	String name;
	int age ;
	int iprn;
	AddStud as1 = new AddStud();
	
	Stud1()
	{
		
	}
	
	public void displayStud1()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("iprn: "+iprn);
	}
}
