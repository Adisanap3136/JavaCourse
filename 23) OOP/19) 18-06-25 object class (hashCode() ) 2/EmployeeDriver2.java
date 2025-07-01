package principleOfOop.principleOfOopObjectClass;

class EmployeeDetail
{
	String name;
	long phno;
	int age;
	int id;
	String designation;
	
	public EmployeeDetail() {}
	
	public EmployeeDetail(String name,long phno,int age,int id,String designation)
	{
		this.name=name;
		this.phno=phno;
		this.age=age;
		this.id=id;
		this.designation=designation;
	}
	
	public int hashCode()
	{
		return name.hashCode()+(int)phno+age+id+designation.hashCode();
	}
	
	public boolean equals(Object o )
	{
		EmployeeDetail e = (EmployeeDetail)o;
		
		if(this.name==e.name&&this.phno==e.phno&&this.age==e.age&&this.id==e.id&&this.designation==e.designation)
			return true;
		else
			return false;
	}

	public String toString() {
		return "EmployeeDetail [name=" + name + ", phno=" + phno + ", age=" + age + ", id=" + id + ", designation="
				+ designation + "]";
	}
	 
}

public class EmployeeDriver2 
{
	public static void main(String[] args)
	{
		EmployeeDetail e1 = new EmployeeDetail("Raju", 123456, 18, 101, "Developer");
		EmployeeDetail e2 = new EmployeeDetail("Raju", 123456, 18, 101, "Developer");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1);
		System.out.println(e2);
	}
}
