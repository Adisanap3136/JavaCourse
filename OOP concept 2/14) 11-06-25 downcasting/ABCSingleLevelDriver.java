package principleOfOopUpcastDowncast;

public class ABCSingleLevelDriver {
	public static void main (String[] args)
	{
//		A   --> aSisnglevel()
//		^
//		B   --> bSisnglevel()               			this is the single level inheritance hierarchy 
//		^
//		C   --> cSisnglevel()
		
		ASingleLevel a1 = new ASingleLevel();
		a1.ASingleLevel();
		System.out.println("--------------------------------------");
		
//		BSinglLevel b1 = (BSinglLevel)a1;        //classcast exception (here performing downcasting without upcasting)
//		System.out.println("--------------------------------------");
		
		ASingleLevel a2 = new CSingleLevel();    //here c upcasted to a
		a2.ASingleLevel();
		System.out.println("--------------------------------------");
		
		BSinglLevel b2 = (BSinglLevel)a2;        //c downcasted to b
		b2.ASingleLevel();
		b2.bSingleLevel();
		System.out.println("--------------------------------------");
		
		CSingleLevel c3 = (CSingleLevel)b2;      //here b downcasted to c (first c upcasted to a then downcast into b and then b reference downcast to c)
		c3.ASingleLevel();
		c3.bSingleLevel();
		c3.cSingleLevel();
		System.out.println("--------------------------------------");
		
		ASingleLevel a3 = new BSinglLevel();       //b upcasted to a
		a3.ASingleLevel();
		
//		CSingleLevel c4 = (CSingleLevel)a3;        //here classcast exception because firstly b upcasted to a then a reference is downcasted to c (without upcasting c to a direct downcasting into a to c)
		
	}
}