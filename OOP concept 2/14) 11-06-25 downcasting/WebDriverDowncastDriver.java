package principleOfOopUpcastDowncast;

public class WebDriverDowncastDriver 
{
	public static void main (String [] args)
	{
		WebDriver w1 = new EdgeDriver();
		w1.automationTool();
		w1.webDriverPermission();
		System.out.println(" -- - - - - - - - -- - - - - - -");
		RemoteWebDriver r1 = (RemoteWebDriver) w1;
		r1.remoteWebDriver();
		System.out.println(" -- - - - - - - - -- - - - - - -");
		EdgeDriver e1 = (EdgeDriver)w1;
		e1.automationTool();
		e1.remoteWebDriver();
		e1.edgeDriver();
		
		RemoteWebDriver r2 = new ChrominumDriver();
		r2.automationTool();
		r2.remoteWebDriver();
		
		EdgeDriver e2 = (EdgeDriver)r2;
		
	}
}
