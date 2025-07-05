package wrapperClass;

public class IntegerByteObjectComparion 
{
	public static void main(String[] args)
	{
//		in wrapper class if we want ot compare two objects then only check same class object reference or variable
		Integer i = new Integer(100);
		
		Byte b = new Byte((byte)100);
		
		System.out.println(b.equals(i));
/*
 * In this example we create the two objects one for Integer and one for Byte class
 * and we purposefully pass the same value 
 * then we compare the both object using equals method but
 * the equals method will override in Every wrapper class here the scenario is happen we use equals method for 
 * checking the Byte object with the Integer object but here the class cast exception has occurred
 * because the Integer object reference will downcast into byte class 
 * but java people handle this using returning false
 * Byte class needed only byte object reference else we get false
 * AND THESE SCENARIO SAME FOR ALL WRAPPER CLASSES
 * 
 *  public boolean equals(Object obj) {
        if (obj instanceof Byte) {
            return value == ((Byte)obj).byteValue();
        }
        return false;
    }
 */
	}
}
