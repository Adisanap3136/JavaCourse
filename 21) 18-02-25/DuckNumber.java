import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		String num =new Scanner(System.in).next();
		if(num.charAt(0)=='0'){
			System.out.println(num+" is NOT DUCK NUMBER!");
			return;
		}
		char x='a';
		for(int i=1;i<num.length();i++){
			 char c =num.charAt(i);
			if(c=='0'){
				x=c;
				break;
			}
		}
		if(x=='0')
			System.out.println(num+" is DUCK NUMBER!");
		else
			System.out.println(num+" is NOT DUCK NUMBER!");
	}
}
//Duck number is a number which contain 0 but cannot start with 0