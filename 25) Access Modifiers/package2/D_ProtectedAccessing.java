package package2;
import package1.D_Protected;

public class D_ProtectedAccessing extends D_Protected
{
	public static void main(String[] args)
	{
		D_ProtectedAccessing d = new D_ProtectedAccessing();
		d.test();
		demo();
		
		System.out.println(d.a);
		System.out.println(b);
	}
}
