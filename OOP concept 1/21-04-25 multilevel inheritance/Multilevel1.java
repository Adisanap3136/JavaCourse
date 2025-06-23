package principleOfOop.Shrikantsirinheritance;

 class University {
	private String name,colleges,dean,course,add,email;
	private int code,contact;
	
	public University() {
		super();
	}
	
	public University(String name, String colleges, String dean, String course, String add, String email, int code,
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

class College extends University
{
	private String name,grade,principle,add,gmail;
	private int students ,department,code;
	
	public College() {
		super();
	}

	

	public College(String name, String grade, String principle, String add, String gmail, int students, int department,
			int code ,/* <-college data*/String uName, String uColleges, String uDean, String uCourse, String uAdd, String uEmail, int uCode,
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
class Department extends College
{
	private String name,hod;
	private int students,staff;
	
	public Department() {
		super();
	}
	
	public Department(String name, String hod, int students, int staff,/*<-departmant data*/String cName, String cGrade, String cPrinciple, String cAdd, String cGmail, int cStudents, int cDepartment,	int cCode ,/*<-college data*/String uName, String uColleges, String uDean, String uCourse, String uAdd, String uEmail, int uCode,int uContact/*university data*/) {
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


class Professor extends Department
{
	private String name,designation,educational;
	private int contact;
	
	public Professor() {
		super();
	}

	public Professor(String name, String designation, String educational, int contact,/*profrssor data */String dName, String dHod, int dStudents, int dStaff, /*Department data*/String cName, String cGrade, String cPrinciple, String cAdd, String cGmail, int cStudents, int cDepartment,
			int cCode  , /*college data*/ String uName, String uColleges, String uDean, String uCourse, String uAdd, String uEmail, int uCode,int uContact/*<- university data*/) {
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


public class Multilevel1{
	public static void main(String[] args) {
		Professor prof = new Professor("Bhabad", "Asst professor", "Phd", 123123132 ,/*<-professor data*/	"Computer","Shaikh",300,15 ,/*<-departmanet data*/"KVN","B+","Chandratre","Nashik","kvn@gmail.com",2500,5,4093 , /*<-college data*/"Sppu","100","Dr.SPPU","ENGG,Pharmacy,MBBS,BSC,MBA","Pune","sppu@gmail.com",1002,91919191/*<- university data*/);
		prof.displayUniversity();
		prof.displayCollege();
		prof.dsiplaySDepartment();
		prof.displayProfessor();
	}
}