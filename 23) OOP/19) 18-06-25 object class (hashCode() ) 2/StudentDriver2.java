package principleOfOop.principleOfOopObjectClass;

class StudentHashCode
{
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public StudentHashCode() {}
	
	public StudentHashCode (String name,String college,int roll,String degree,String stream)
	{
		this.name=name;
		this.college=college;
		this.roll=roll;
		this.degree=degree;
		this.stream=stream;
//		System.out.println("Stundet added name is : "+name);
	}

	public void displayStudent() {
		    System.out.println("StudentHashCode [name=" + name + ", college=" + college + ", roll=" + roll + ", degree=" + degree
				+ ", stream=" + stream + "]");
	}
	
//	int this code i override the object class hashCode() method, because i want to give customize the object reference
//	to override hashcode() there is not necessary to override the toString  
//	hashcode is responsible to generate reference to each object
	public int hashCode()
	{
		return roll+name.hashCode()+college.hashCode()+degree.hashCode()+stream.hashCode();
	}
	
	public boolean equals(Object o)
	{
		StudentHashCode s = (StudentHashCode)o;
		
		if(this.name==s.name&&this.college==s.college&&this.roll==s.roll&&this.degree==s.degree&&this.stream==s.stream)
			return true;
		else
			return false;
	}
}

public class StudentDriver2 
{
	public static void main(String[] args)
	{
		StudentHashCode s1 = new StudentHashCode("Raju", "Coep", 123, "BE", "IT");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		
		StudentHashCode s2 = new StudentHashCode("Raju", "Coep", 123, "BE", "IT");
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		System.out.println("equality operator == "+(s1==s2));
		System.out.println("equal method: "+(s1.equals(s2)));
	}
}
