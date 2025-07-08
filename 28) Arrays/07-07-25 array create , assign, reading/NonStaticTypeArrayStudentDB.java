package arrays;

class Student
{
	String name;
	String college;
	int age;
	int id;
	
	public Student() {}
	
	public Student(String name,String college,int age,int id)
	{
		super();
		this.name=name;
		this.college=college;
		this.age=age;
		this.id=id;
	}
	
//	here we overriding the toString for getting the customize reference of object
	@Override   
	public String toString()
	{
		return "[Student: Name: "+name+", College: "+college+", Age: "+age+", id: "+id+"]";		
	}
}

public class NonStaticTypeArrayStudentDB 
{
	public static void main(String[] args)
	{
		Student s[] = new Student[4];
		s[0] = new Student("Raju","FC",21,10);
		s[1] = new Student("Rani","FC",20,20);
		s[2] = new Student("Rocky","JSPM",22,30);
		s[3] = new Student("Something","COEP",20,40);
		
		for(int i=0;i<s.length;i++)
			System.out.println("Student details: "+s[i]);
		
		for(int i=0;i<s.length;i++)
			System.out.println("Stundet id: "+s[i].id);
	}
}