public class PatientDriver {

	public static void main(String[] args) {
		PatientDetails p1 =new PatientDetails("Raju", 1000, 123456789, "Maxico,Munich,German");
		System.out.println("Patient Name: "+p1.getPatientName());
		System.out.println("Patient id: "+p1.getPid());
		System.out.println("P phone: "+p1.getPhone());
		System.out.println("p Address: "+p1.getPadd());
		System.out.println("p history: "+p1.getHistory());
		p1.setHistory("This Patient has Cronic Pancreatic Problem");

		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

		PatientDetails p2 =new PatientDetails("Rani", 0, 987654321, "California,Nwe York");
		System.out.println("Patient Name: "+p2.getPatientName());
		System.out.println("Patient id: "+p2.getPid());
		System.out.println("P phone: "+p1.getPhone());
		System.out.println("p Address: "+p2.getPadd());
		System.out.println("p history: "+p2.getHistory());
		p2.setHistory("This Patient has Stomach Problem");
	}

}
