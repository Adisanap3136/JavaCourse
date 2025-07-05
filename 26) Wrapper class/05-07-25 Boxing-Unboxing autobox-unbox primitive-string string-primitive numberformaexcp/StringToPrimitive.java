package wrapperClass;

public class StringToPrimitive 
{
	public static void main(String[] args)
	{
//		Here we perform the String to primitive type
//		because every time data is come from Frontend in the form of String 
//		then we need to convert it into primitive for performing operation
//		ex: password and username
//		we convert this using a static parse method which is present in all wrapper class
		
		String b1 = "123";
//		String b1 = "1231";      //java.lang.NumberFormatException: Value out of range. Value:"1231" Radix:10
//		String b1 = "1a";        //java.lang.NumberFormatException: For input string: "1a"
//		String b1 = "";          //java.lang.NumberFormatException: For input string: ""
//		String b1 = null;          //java.lang.NumberFormatException: null
		byte b2 = Byte.parseByte(b1);
		System.out.println("String to byte: "+b2);
		
		String s1 = "32153";
//		String s1 = "32.0";      //java.lang.NumberFormatException: For input string: "32.0"
//		String s1 = "";          //java.lang.NumberFormatException: For input string: ""
//		String s1 = null  ;      //java.lang.NumberFormatException: null    
//		String s1 = "545d";      //java.lang.NumberFormatException: For input string: "545d"
		short s2 = Short.parseShort(s1);
		System.out.println("String to short: "+s2);
		
		String c1 = "AA";
//		String c1 = "4564frwergfrg";    //allow because charAt will accecc through index
//		String c1 = "";         //java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		String c1 = "15315";    //java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//		String c1 = null;       //java.lang.NullPointerException
		char c2 = c1.charAt(0);
		System.out.println("String to char: "+c2);
		
		String i1 = "132135";
//		String i1 = "";        //java.lang.NumberFormatException: For input string: ""
//		String i1 = "1515.45";     //java.lang.NumberFormatException: For input string: "1515.45"
//		String i1 = null;          //java.lang.NumberFormatException: null
//		String i1 = "eve54";       //java.lang.NumberFormatException: For input string: "avdhc151"
		int i2 = Integer.parseInt(i1);
		System.out.println("String to int: "+i2);
		
		String l1 = "2154";
//		String l1 = "2154l";    //java.lang.NumberFormatException: For input string: "2154l"
//		String l1 = "";        //java.lang.NumberFormatException: For input string: ""
//		String l1 = null;      //java.lang.NumberFormatException: null
//		String l1 = "sdf56";    //java.lang.NumberFormatException: For input string: "sdf56"
//		String l1 = "10.0";		//java.lang.NumberFormatException: For input string: "10.0"
		long l2 = Long.parseLong(l1);
		System.out.println("String to long: "+l2);
		
		String f1 = "151313.51";
//		String f1 = "151313.51f";        //allow
//		String f1 = "15131sd3f.51f";    // java.lang.NumberFormatException: For input string: "15131sd3f.51f"
//		String f1 = "";			//java.lang.NumberFormatException: empty String
//		String f1 = null;         //java.lang.NullPointerException
		float f2 = Float.parseFloat(f1);
		System.out.println("String to float: "+f2);
		
//		String d1 = "6468.1844847854654867817";
//		String d1 = ""; 	//java.lang.NumberFormatException: empty String
//		String d1 = null;     //java.lang.NullPointerException
//		String d1 = "13555513.0f";     //allow
//		String d1 = "13555513.0d";     //allow
//		String d1 = "135555efewf13.0d";     //java.lang.NumberFormatException: For input string: "135555efewf13.0d"
		String d1 = "13555513.0l";     //java.lang.NumberFormatException: For input string: "13555513.0l"
		double d2 = Double.parseDouble(d1);
		System.out.println("String to double: "+d2);
		
//		if in boolean parse method we pass anything other than true , false it give false not throw error
		
//		String b3 = "true";             //true
//		String b3 = "TRUE";             //true
//		String b3 = "123";             //false
//		String b3 = "";             //false
//		String b3 = "False";             //false
		String b3 = "False";             //false   
		boolean b4 = Boolean.parseBoolean(b3);
		System.out.println("String to boolean: "+b4);
	}
}
