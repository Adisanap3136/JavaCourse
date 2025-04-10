package principleOfOop;

public class MarkerDriver {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		
		m1.r1.color = "Black";
		m1.r1.size = 0.5  ;
		m1.r1.displayRefill();
	}
}

/*
 * Here we write a program for HAS-A relationship 
 * two objects is depend on each other 
 * here the refil is sub-objct of marker object
 * and we can write a object creation statement in marker class
 * when we create a object of marker class in driver class then automatically the object of refil
 * 
 * [and to access the attributes and behaviour of refill class then first take reference of class in which the refill class is created 
 * means { m1.r1.displayRefil() }]   
 *  */