package finalModifier;

class Camera
{
	String brand;
	double price;
	boolean nightVision;
	int pixel;
	
	public Camera() {}
	
	public Camera(String brand,double price,int pixel,boolean nightVision)
	{
		super();
		this.brand=brand;
		this.price=price;
		this.pixel=pixel;
		this.nightVision=nightVision;
	}
	
	public String toString()
	{
		return "Camera: [Brand: "+brand+", Price: "+price+", Pixel: "+pixel+", Night Vision: "+nightVision+"]";
	}
	
	public boolean equals(Object o)
	{
		if(o!=null&& o instanceof Camera)
		{
			Camera c = (Camera)o;
			return this.brand==c.brand && this.price==c.price && this.pixel==c.pixel && this.nightVision==c.nightVision;
		}
		return false;
	}
	
	public int hashCode()
	{
		return brand.hashCode()+Double.hashCode(price)+pixel+Boolean.hashCode(nightVision);
	}
//	in this hasCode method we get the hashcode of Double and Boolean wrapper class instead direct add normal double and the boolean will never add norammly
}

public class hashCodeOverrideUsingBoolean_Double 
{
	public static void main(String[] args)
	{
		Camera c1 = new Camera("Nikon",125.00,5,false);
		Camera c2 = new Camera("Nikon",125.00,5,false);
		
		System.out.println(c1);		
		System.out.println(c2);		
		
		System.out.println("Overrided hashcode: "+c1.hashCode());
		System.out.println("Overrided hashcode: "+c2.hashCode());
		
		System.out.println("verifying if even we pass other object it handle or not: "+c1.equals(new hashCodeOverrideUsingBoolean_Double()));      //if we pass other class reference , we cannot get class cast exception because we handle it in camera class
		
		System.out.println("Equality oerator: "+(c1==c2));
		System.out.println("overrided equal method calling: "+c1.equals(c2));
	}
}
