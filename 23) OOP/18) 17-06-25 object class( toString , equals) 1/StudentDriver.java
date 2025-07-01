package principleOfOop.principleOfOopObjectClass;

class Student
{
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student() {}
	
	public Student(String name,String college,int roll,String degree,String stream)
	{
		this.name=name;
		this.college=college;
		this.roll=roll;
		this.degree=degree;
		this.stream=stream;
	}
	
//	here the toString() will return always the reference of the class, but here we override these method we create our own method [we override the object class method]
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", roll=" + roll + ", degree=" + degree + ", stream=" + stream + "]";
	}
	
//	here the equals() will compare the reference of objects , but our override design will compare the data which is present in the object [we override the object class method]
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		if(this.name==s.name&&this.college==s.college&&this.roll==s.roll&&this.degree==s.degree&&this.stream==s.stream)
			return true;
		else
			return false;
	}
}

public class StudentDriver 
{
	public static void main(String []args)
	{
//		In this example we create a our own method rather than using object class method , using method overriding
//		here the toString() will return always the reference of the class, but here we override these method we create our own method
//		here the equals() will compare the reference of objects , but our override design will compare the data which is present in the object
		
		Student s1 = new Student("Raju", "COEP", 39, "BE", "IT");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s1.getClass());
		
		System.out.println("------------------------------------------------------------------------------");
		
		Student s2 = new Student("Raju", "COEP", 39, "BE", "IT");
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		System.out.println(s2.getClass());

		System.out.println("------------------------------------------------------------------------------");
		System.out.println(s1==s2);                //false because the even values is same but the actual reference is different of both class
		System.out.println(s1.equals(s2));         //true , because the overridden method is running here
		
	}
}












