package principleOfOop.principleOfOopObjectClass;

class QspiderStudentTracker
{
	String name;
	long mob;
	String email;
	String batch;
	boolean incubation;
	
	public QspiderStudentTracker() {}
	
	public QspiderStudentTracker(String name,long mob,String email,String batch,boolean incubation)
	{
		this.name=name;
		this.mob=mob;
		this.email=email;
		this.batch=batch;
		this.incubation=incubation;
		System.out.println("Record updated of: "+name);
	}
	public String toString()
	{
		return "Qspider student tracker: [ Name="+name+" , phone="+mob+" , Email="+email+" , Batch="+batch+" , Incubation="+incubation+" ]" ;
	}
	
	public boolean equals(QspiderStudentTracker o)
	{
//		QspiderStudentTracker qsp = (QspiderStudentTracker)o;
		
//		if(this.mob==qsp.mob&&this.email==qsp.email)
//		if(this.mob==o.mob&&this.email==o.email)
		System.out.println(this+" "+o);
		if(this==o)
		{
			System.err.println("Duplicate Admission found: "+name + " "+this.batch+" "+o.batch+"\n");
			return true;
		}
		else
			return false;
	}
}

public class QspiderStudentTrackerDriver 
{
	public static void main (String [] args)
	{
		Object p =new Object();
		
		QspiderStudentTracker qsp1 = new QspiderStudentTracker("vikas",123123123,"vikas@gmail.com","M39",true);
		System.out.println(qsp1);
		QspiderStudentTracker qsp2 = new QspiderStudentTracker("vikas", 123123123, "vikas@gmail.com", "M39", true);
		System.out.println(qsp2);
		QspiderStudentTracker qsp3 = new QspiderStudentTracker("Kamal", 321321321, "kamal@gmail.com", "m39", true);
		System.out.println(qsp3);
		QspiderStudentTracker qsp4 = new QspiderStudentTracker("Mukesh", 456654456, "mukesh@gmail.com", "m38", false);
		System.out.println(qsp4);
		System.out.println();
		System.out.println(qsp1.equals(qsp2));
						
	}
}
