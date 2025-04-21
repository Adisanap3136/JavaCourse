package principleOfOop.Shrikantsirinheritance;

class Country{
	   private String name,language,president,primeMinister,currency;
	   int countryCode,states,population;
	   
	   public Country() {
		   super();
	   }

	public Country(String name, String language, String president, String primeMinister, String currency,
			int countryCode, int states, int population) {
		super();
		this.name = name;
		this.language = language;
		this.president = president;
		this.primeMinister = primeMinister;
		this.currency = currency;
		this.countryCode = countryCode;
		this.states = states;
		this.population = population;
	}

	public void displayCountry() {
		System.out.println("Country Details");
		System.out.println( "Country [name=" + name + ", language=" + language + ", president=" + president + ", primeMinister="
				+ primeMinister + ", currency=" + currency + ", countryCode=" + countryCode + ", states=" + states
				+ ", population=" + population + "]");
	}
}

class States extends Country{
	private String name,cm,language;
	private int pop,districts;
	private double area;
	
	public States() {
		super();
	}

	public States(String name, String cm, String language, int pop, int districts, double area,
			String cName, String cLanguage, String cPresident, String cPrimeMinister, String cCurrency,
			int cCountryCode, int sStates, int cPopulation) {
		super(cName, cLanguage, cPresident, cPrimeMinister, cCurrency, cCountryCode, sStates, cPopulation);
		this.name = name;
		this.cm = cm;
		this.language = language;
		this.pop = pop;
		this.districts = districts;
		this.area = area;
	}

	public void displayState() {
		System.out.println("State Details");
		System.out.println( "States [name=" + name + ", cm=" + cm + ", language=" + language + ", pop=" + pop + ", districts="
				+ districts + ", area=" + area + "]");
	}
		
}

public class SingleLevel1 {
	public static void main(String[] args) {
		States s1= new States("MAHARASHTRA", "Shinde Saheb", "Marathi", 132456789, 36, 9876532, "INDIA", "Hindi", "Murmu", "Modi ji", "Rupees", 99999999, 29, 13265449);
		s1.displayCountry();
		s1.displayState();
	}
}
