//25-01-2025 Kokate sir Q.Write a program to check the character is vovels or consent.
import java.util.Scanner;
class Vovels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Alphabet: ");
		char ch = sc.next().charAt(0);

		String c = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? (ch+" : Vovel") : ("Consonent");
		System.out.println(c);
	}
}
