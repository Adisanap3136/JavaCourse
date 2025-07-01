package principleOfOopUpcastDowncast;

public class ABCHierarchicalLevelDriver {
	public static void main(String[] args) 
	{
//			A
//		  /   \                //hierarchical inheritance
//		 B     C 

//		CHierarchical c1 = new CHierarchical();
//		c1.xyz();
//		c1.abc();
		
		AHierarchical a1 = new CHierarchical();        // c upcast to a
		a1.xyz();
				
//		BHierarchical b1 = (BHierarchical)a1;         // c downacast to b -> classcast exception occurs
//		b1.abc();
		
		CHierarchical c2 = (CHierarchical)a1;         //c get back downcast to c
		c2.xyz();
		c2.abc();
	}
}
