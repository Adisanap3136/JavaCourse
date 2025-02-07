//20-01-2025 Q.Using data calculate the next 5 year Population. (Kokate sir)

class PopCensus
{
	public static void main(String[] args) 
	{
		int currPop = 312032486;
		int seconds = (365*24*60*60)*5;
		int birth = seconds/7;
		int death = seconds/13;
		int immigrant = seconds/45;

		int newPop = (currPop + birth + immigrant) - death;
		System.out.println("Current Population is: "+currPop);
		System.out.println("Next 5 year Population is: "+newPop);
	}
} 