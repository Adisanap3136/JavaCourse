package principleOfOop.Shrikantsir;
import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		Student obj1 = new Student("Raju", "raju@gamil.com", 101,"BE-CS", 2025);
		Student obj2 = new Student("chutki", "raju@gamil.com", 102,"BE-CS", 2025);
		Student obj3 = new Student("bheem", "raju@gamil.com", 103,"BE-CS", 2025);
		Student obj4 = new Student("jaggu", "raju@gamil.com", 104,"BE-CS", 2025);
		
		ArrayList<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(obj1);
		studentlist.add(obj2);
		studentlist.add(obj3);
		studentlist.add(obj4);
		
		for (Student ele : studentlist) {
			ele.displayStudent();
		}
	}
}