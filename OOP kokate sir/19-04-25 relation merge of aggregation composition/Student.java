package principleOfOop.Shrikantsir;

public class Student {
	String name;
	String email;
	int sid;
	String education;
	int yop;
	
	private Student() {
	}

	public Student(String name, String email, int sid, String education, int yop) {
		this.name = name;
		this.email = email;
		this.sid = sid;
		this.education = education;
		this.yop = yop;
	}

	public void displayStudent() {
		System.out.println("Student [name=" + name + ", email=" + email + ", sid=" + sid + ", education=" + education + ", yop="
				+ yop + "]");
	}
	
	
}
