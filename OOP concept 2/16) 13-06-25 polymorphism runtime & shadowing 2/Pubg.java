package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;

public class Pubg 
{
	int bullets = 30;
	
	public Pubg() 
	{
	}
	
	public void turnRight()
	{
		System.out.println("Turned Right!");
	}
	public void turnLeft()
	{
		System.out.println("Turned Right");               //bug/Glitch
	}
	public void fire()
	{
		if(bullets>0)
		{
			bullets--;
			System.out.println("Fired---->>>>>> \n" +bullets+" bulltes left" );
		}
		else
		{
			System.out.println("Reload");
		}
	}
	public void reloadGun()
	{
		bullets = 30;
		System.out.println("Reloaded");
	}
	public void forward(int steps)
	{
		System.out.println("Forwarded with "+steps+" steps");
	}
	public void backward(int steps)
	{
		System.out.println("Forwarded with "+steps+" steps");           //bug/glitch
	}
}
