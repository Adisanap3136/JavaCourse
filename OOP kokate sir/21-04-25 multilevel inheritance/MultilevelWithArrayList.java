package principleOfOop.Shrikantsirinheritance;


import java.util.ArrayList;

class University2 {
	private String name,colleges,dean,add,email;
	private int code,contact;
	private ArrayList<String> course = new ArrayList<String>();
	
	public University2() {
		super();
	}
	
	public University2(String name, String colleges, String dean, ArrayList<String> course, String add, String email, int code,
			int contact) {
		super();
		this.name = name;
		this.colleges = colleges;
		this.dean = dean;
		this.course = course;
		this.add = add;
		this.email = email;
		this.code = code;
		this.contact = contact;
	}



	public void displayUniversity() {
		System.out.println( "University [name=" + name + ", colleges=" + colleges + ", dean=" + dean + ", course=" + course
				+ ", add=" + add + ", email=" + email + ", code=" + code + ", contact=" + contact + "]");
	}
	
}

class College2 extends University2
{
	private String name,grade,principle,add,gmail;
	private int students,code;
	private ArrayList<String>  department = new ArrayList<String>();
	
	public College2() {
		super();
	}

	

	public College2(String name, String grade, String principle, String add, String gmail, int students, ArrayList<String> department,
			int code ,/* <-college data*/String uName, String uColleges, String uDean, ArrayList<String> uCourse, String uAdd, String uEmail, int uCode,
			int uContact /*<-university data*/) {
		super(uName, uColleges, uDean, uCourse, uAdd, uEmail, uCode, uContact);
		this.name = name;
		this.grade = grade;
		this.principle = principle;
		this.add = add;
		this.gmail = gmail;
		this.students = students;
		this.department = department;
		this.code = code;
	}

	public void displayCollege() {
		System.out.println( "Collge [name=" + name + ", grade=" + grade + ", principle=" + principle + ", add=" + add + ", gmail="
				+ gmail + ", students=" + students + ", department=" + department + ", code=" + code + "]");
	}
		
}
class Department2 extends College2
{
	private String name,hod;
	private int students,staff;
	
	public Department2() {
		super();
	}
	
	public Department2(String name, String hod, int students, int staff,/*<-departmant data*/String cName, String cGrade, String cPrinciple, String cAdd, String cGmail, int cStudents, ArrayList<String> cDepartment,	int cCode ,/*<-college data*/String uName, String uColleges, String uDean, ArrayList<String> uCourse, String uAdd, String uEmail, int uCode,int uContact/*university data*/) {
		super(cName, cGrade, cPrinciple, cAdd, cGmail, cStudents, cDepartment, cCode, uName, uColleges, uDean, uCourse, uAdd, uEmail, uCode, uContact);
		this.name = name;
		this.hod = hod;
		this.students = students;
		this.staff = staff;
	}

	public void dsiplaySDepartment() {
		System.out.println( "Department [name=" + name + ", hod=" + hod + ", students=" + students + ", staff=" + staff + "]");
	}
	
}


class Professor2 extends Department2
{
	private String name,designation,educational;
	private int contact;
	
	public Professor2() {
		super();
	}

	public Professor2(String name, String designation, String educational, int contact,/*profrssor data */String dName, String dHod, int dStudents, int dStaff, /*Department data*/String cName, String cGrade, String cPrinciple, String cAdd, String cGmail, int cStudents, ArrayList<String> cDepartment,
			int cCode  , /*college data*/ String uName, String uColleges, String uDean, ArrayList<String> uCourse, String uAdd, String uEmail, int uCode,int uContact/*<- university data*/) {
		super(dName, dHod, dStudents, dStaff, cName, cGrade, cPrinciple, cAdd, cGmail, cStudents, cDepartment, cCode, uName, uColleges, uDean, uCourse, uAdd, uEmail, uCode, uContact);
		this.name = name;
		this.designation = designation;
		this.educational = educational;
		this.contact = contact;
	}

	public void displayProfessor() {
		System.out.println( "Professor [name=" + name + ", designation=" + designation + ", educational=" + educational
				+ ", contact=" + contact + "]");
	}
	
	
}


public class MultilevelWithArrayList{
	public static void main(String[] args) {
		
		System.out.println("ArrayList university program");
		
		ArrayList<String> uCourse = new ArrayList<String>();
		uCourse.add("ENGINEERING");
		uCourse.add("PHARMACY");
		uCourse.add("MBBS");
		uCourse.add("MBA");
		uCourse.add("BSC");
		
		ArrayList<String> cDepart = new ArrayList<String>();
		cDepart.add("COMPUTER");
		cDepart.add("INFORMATION TECH");
		cDepart.add("MECH");
		cDepart.add("ELECTRIC");
		cDepart.add("ENTC");
		
		Professor2 prof = new Professor2("Bhabad", "Asst professor", "Phd", 123123132 ,/*<-professor data*/	"Computer","Shaikh",300,15 ,/*<-departmanet data*/"KVN","B+","Chandratre","Nashik","kvn@gmail.com",2500,cDepart,4093 , /*<-college data*/"Sppu","100","Dr.SPPU",uCourse,"Pune","sppu@gmail.com",1002,91919191/*<- university data*/);
		prof.displayUniversity();
		prof.displayCollege();
		prof.dsiplaySDepartment();
		prof.displayProfessor();
	}
}