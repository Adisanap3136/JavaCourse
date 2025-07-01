package principleOfOop.Interface;
//23-06-25 
interface InstaReq1
{
	static void wish(){System.out.println("hey, welcome to instagram");}
	void post(String ip,String name);
	void like(String name);
	void comment(String ip,String name);
}
interface InstaReq2 extends InstaReq1
{
	void msg(String ip,String sneder,String receiver);
	void story(String ip,String name);
}
abstract class InstagramVersion1 implements InstaReq2
{
	String name,pass;
	public InstagramVersion1() {}
	public InstagramVersion1(String name,String pass) 
	{
		this.name=name;
		this.pass=pass;
	}
	public void post(String ip,String name)
	{
		System.out.println(ip);
		System.out.println(name+" Posted!");
	}
	public void like(String name)
	{
		System.out.println(name+" liked post");
	}
	public void comment(String ip,String name)
	{
		System.out.println(ip);
		System.out.println(name+" Commented!");
	}
}
class InstagramVersion2 extends InstagramVersion1
{
	public void msg(String ip,String name,String receiver)
	{
		System.out.println(ip);
		System.out.println(name+"'s message delivered to "+receiver);
	}
	public void story(String ip,String name)
	{
		System.out.println(ip);
		System.out.println(name+" Story updated!");
	}
}
public class InstagramDriver
{
	public static void main(String [] args)
	{
		InstaReq1 i1 = new InstagramVersion2();
		InstaReq2 i2 = (InstaReq2)i1;
		
		i1.post("Hi, I am happy today", "Raju");
		i1.like("Angel Priya");
		i1.comment("How?", "Angel Priya");
		i1.comment("Who are you,Can you know me", "Raju");
		i2.msg("hey, hi how are you", "Raju","Angel Priya");
		i2.msg("hey, are you too much busy no time for reply, then bhaad me jao!", "Raju","Angel Priya");
		i2.story("I am a lone Wolf", "Raju");
		i1.comment("How?", "Angel Priya");
	}
}
