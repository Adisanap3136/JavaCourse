package principleOfOop;

public class StudnetDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Raju", "Python Full Stak", 35650, "Hadapsar", 8.5, "BE", 80, 81, 9876543210l);
		
		System.out.println("Name: "+s1.getName());
		System.out.println("Course: "+s1.getCourse());		
		System.out.println("Fees: "+s1.getFees());		
		System.out.println("Branch: "+s1.getBranch());		
		System.out.println("Degree: "+s1.getDegree());		
		System.out.println("CGPA: "+s1.getCgpa());		
		System.out.println("SSC%: "+s1.getSscPer());
		System.out.println("HSC%: "+s1.getHscPer());		
		System.out.println("Phone: "+s1.getPhno());		
		
		s1.setBranch(true, "Deccan Gymkhana");
		System.out.println("Branch: "+s1.getBranch());		
		
		s1.setPhno(true, 1234567890);
		System.out.println("Phone: "+s1.getPhno());		
		
		s1.setDegree(true,"M-tech");
		System.out.println("Degree: "+s1.getDegree());		
	}
}