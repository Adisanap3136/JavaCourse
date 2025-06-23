package principleOfOop;

public class PenRefillDriver {
	public static void main (String[] args)
	{
		Pen p1 = new Pen("Cello Gipper", "Ball Pen", 10, "Blue", "Ball Point", 0.5);
		p1.displayPen();
		p1.pr.displayRefill();
		
		System.out.println("- - - - - - - - - - - - - - - - - - -- - - - - - - - -");
		
		Pen p2 = new Pen("Tramax", "Ball Pen", 50, null, null, 0);
		p2.displayPen();
		p2.pr.color = "black";
		p2.pr.displayRefill();
		
//		Pen p3 = new Pen("Natraj", "Gel", 5);
//		p3.displayPen();
//		p3.pr.displayRefill();
//		
	}
}
/*
 * Here i implement the early binding it means i create a sub object in main object 
 * while i create a main object in driver class then automatically the another class object will create 
 * and that automatic created object reference will store in the main object 
 * 
 * */
