class Employee
{
	String empName;
	int empId;
	double sallary;
	String empRole;
	boolean empType;       //full time or not(contract base)
	String company;

	public Employee() {}

	public Employee(String empName,int empId,double sallary,String empRole,boolean empType,String company)
	{
		super();
		this.empName = empName;
		this.empId=empId;
		this.sallary=sallary;
		this.empType=empType;
		this.company=company;
	}

	public String toString()
	{
		return "Employee Details: ["+"Name: "+empName+" , Id: "+empId+" , Sallary: "+sallary+" , Type: "+empType+" , Company: "+company +"]";
	}

	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		if(this.empName==e.empName&&this.empId==e.empId&&this.empType==e.empType&&this.company==e.company)
		{
			System.err.println("Duplicate entry found!, Disqualify candidate id is: "+this.empId);
			return true;
		}
		else if(this.sallary==e.sallary)
		{
			System.out.println("Based on sallary: "+this.empName+" ,"+e.empName);
			return true;
		}
		else if(this.company==e.company)
		{
			System.out.println("Based on Company: "+this.empName+" ,"+e.empName);
			return true;
		}
		else if(this.empType==e.empType)
		{
			System.out.println("Based on Employee type: "+this.empName+" ,"+e.empName);
			return true;
		}
		else
			return false;
	}
}

public class EmployeeDriver
{
	public static void main(String[] args) throws InterruptedException
	{
		Employee e1 = new Employee("Rani", 121221, 4500000.00, "Software Developer", true, "Infosys");;
		System.out.println(e1);
		Thread.sleep(700);
		Employee e2 = new Employee("Rani", 12121, 4500000.00, "Software Developer", true, "Infosys");;;
		System.out.println(e2);
		Thread.sleep(700);
		Employee e3 = new Employee("Rakes", 1001, 500000, "Data Entry", true, "TCS");
		System.out.println(e3);
		Thread.sleep(700);
		Employee e4 = new Employee("Binod", 576, 350000, "Executive", true, "Jio");
		System.out.println(e4);
		System.out.println();
		Thread.sleep(700);
		e1.equals(e2);
		Thread.sleep(700);
		e2.equals(e4);
		System.out.println();
	}
}
