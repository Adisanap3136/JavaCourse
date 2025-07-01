package principleOfOop.SuperCall;

class University
{
	String name;
	String vc;
	String location;
	String type;
	int noOfColleges;
	int code;
	
	public University() {}
	
	public University(String name,String vc,String location,String type,int noOfColleges,int code)
	{
		this.name=name;
		this.vc=vc;
		this.location=location;
		this.type=type;
		this.noOfColleges=noOfColleges;
		this.code=code;
	}
	
	public void displayUniversity()
	{
		System.out.println("Name: "+name);
		System.out.println("VC: "+vc);
		System.out.println("location: "+location);
		System.out.println("Type: "+type);
		System.out.println("No of Colleges: "+noOfColleges);
		System.out.println("======================================");
	}
}

class College extends University
{
	String cName;
	String principle;
	int staff;
	int dept;
	int cCode;
	
	public College() {}
	
	public College(String name,String vc,String location,String type,int noOfColleges,int code,
			String cName,String principle,int staff,int dept,int cCode)
	{
		super(cName, vc, location, type, noOfColleges, cCode);//constructor chaining 
//		here we implicitly pass the data to the super class constructor
		
		this.cName=cName;
		this.principle=principle;
		this.staff=staff;
		this.dept=dept;
		this.cCode=cCode;
	}
	
	public void displayCollge()
	{
		System.out.println("College Name: "+cName);
		System.out.println("College Principle: "+principle);
		System.out.println("College Staff: "+staff);
		System.out.println("College Department: "+dept);
		System.out.println("College code: "+cCode);
		System.out.println("===========================================");
	}
}

class Department extends College
{
	String dName;
	String hod;
	int faculty;
	String dType;      //degree or diploma
	
	public Department() {}
	
	public Department(String name,String vc,String location,String type,int noOfColleges,int code,
			String cName,String principle,int staff,int dept,int cCode,
			String dName,String hod,int faculty,String dType)
	{
		super(dName, vc, location, dType, noOfColleges, code,cName, principle, staff, dept, cCode);//here i pass the data to the super class constructor 
//		and that class will also pass the data to the that class super class constructor
		
		this.dName=dName;
		this.hod=hod;
		this.faculty=faculty;
		this.dType=dType;
	}
	public void displayDepartment()
	{
		System.out.println("Department Name: "+dName);
		System.out.println("Department HOD: "+hod);
		System.out.println("Department Faculty: "+faculty);
		System.out.println("Department Type degree or diploma: "+dType);
		System.out.println("===================================");
	}
	void dispAll()
	{
		displayUniversity();
		displayCollge();
		displayDepartment();
	}
}

public class UniversityMultilevelDriver 
{
	public static void main(String[] args)
	{
		Department d1 = new Department("SPPU", "Dr.Subhash", "Pune", "Technical", 1000, 4093, "KVN Naik", "Dr.K.V.Chandratre", 200, 10, 8625, "Computer Engineering", "Prof.R.M.Shaikh", 20, "Degree");
		
		d1.dispAll();
	}
}