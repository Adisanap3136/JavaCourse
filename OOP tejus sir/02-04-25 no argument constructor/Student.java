class Student
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;

	Student()           //no parameterized constructor
	{
		System.out.println("No-Args Constructor Start");
		System.out.println("this: "+this);
		System.out.println("No-Args Constructor End");
	}
/*
	{
		System.out.println("in non static block");
		System.out.println(this);  //print same current objects reference
	}
*/
	public void displayStudent()
	{
		String name = "Mighty Raju";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this);
		System.out.println(age);
		System.out.println(coll);
		System.out.println(degree);
		System.out.println(roll);
	}

	public static void main (String [] args)
	{
		System.out.println("main ");
	}
}
