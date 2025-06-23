package principleOfOop.Shrikantsir;

public class BagDriver {
	public static void main(String[] args) {
		Bag bag = new Bag("American Tourister", "College Bag", 40, 4, 2000, "SkyBlue", "Syanthetic Material");
		bag.displayBag();
		
		bag.addBook("Notebook", "Classmate", "JAVA", 400, 70);
		bag.addBook("Notebook", "Classmate", "JAVA", 400, 70);
		for (Book ele : bag.listBook) {
			ele.displayBook();			
		}
		
		bag.addPen("Cello Gripper", "ball pen", "blue", 10);
		bag.addPen("Pilot", "marker", "blue", 10);
		for(Pen ele : bag.listPen) {
			ele.displayPen();
		}			
		
		bag.addLaptop("ASUS", "F17", 48000);
		bag.l1.displayLaptop();
		
		bag.addWaterBottle("fibre", 1, "milton", 100);
		bag.w1.displayWaterBottle();
	}
}
