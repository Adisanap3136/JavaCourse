package principleOfOopUpcastDowncast;

public class WebDriverMainUpcastDriver 
{
	public static void main (String [] args)
	{
		
//		this is all the upcasting here we do the upcastin on hybrid inheritance
		
		WebDriver w1 = new RemoteWebDriver();            //upcasting
		w1.automationTool();
		w1.webDriverPermission();
		
		System.out.println(" -- - - - - - - - -- - - - - - -");
		
		WebDriver w2 = new EdgeDriver();
		w2.automationTool();
		w2.webDriverPermission();

		System.out.println(" -- - - - - - - - -- - - - - - -");
		
		WebDriver w3 = new ChrominumDriver();
		w3.automationTool();
		w3.webDriverPermission();
		
		System.out.println(" -- - - - - - - - -- - - - - - -");
		
		RemoteWebDriver r1 = new ChrominumDriver();
		r1.automationTool();
		r1.webDriverPermission();
		r1.remoteWebDriver();
	}
}
