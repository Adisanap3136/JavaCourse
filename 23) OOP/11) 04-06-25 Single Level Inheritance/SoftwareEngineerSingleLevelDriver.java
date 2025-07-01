package principleOfOop.Inheritance;

class SoftwareEngineer
{
	String name;
	String company;
	int projects;
	String techStack;
	double sallary;
	String degree;
	
	public SoftwareEngineer() {}
	
	public SoftwareEngineer(String name,String company,int projects,String techStack,double sallary,String degree)
	{
		this.name=name;
		this.company=company;
		this.projects=projects;
		this.techStack=techStack;
		this.sallary=sallary;
		this.degree=degree;
	}
	
	public void displaySoftwareEngineer()
	{
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Projects: "+projects);
		System.out.println("Tech Stack: "+techStack);
		System.out.println("Sallary: "+sallary);
		System.out.println("Degree: "+degree);
		System.out.println("============================================");
	}
}

class Developer extends SoftwareEngineer
{
	String department;
	int noticePriod;
	String position;
	String currentProject;
	int exp;
	
	public Developer() {}
	
	public Developer(String name,String company,int projects,String techStack,double sallary,String degree,
			String department,int noticePeriod,String position,String currentProject, int exp)
	{
		this.name=name;
		this.company=company;
		this.projects=projects;
		this.techStack=techStack;
		this.sallary=sallary;
		this.degree=degree;
		
		this.department=department;
		this.noticePriod=noticePeriod;
		this.position=position;
		this.currentProject=currentProject;
		this.exp=exp;
	}
	
	public void displayAllDetail()
	{
		displaySoftwareEngineer();
		displayDeveloper();
	}
	
	public void displayDeveloper()
	{
		System.out.println("Department: "+department);
		System.out.println("Notice Period: "+noticePriod);
		System.out.println("Position: "+position);
		System.out.println("Current Project: "+currentProject);
		System.out.println("Experiment: "+exp);
		System.out.println("============================================");
	}
}

public class SoftwareEngineerSingleLevelDriver 
{
	public static void main(String[] args)
	{
		Developer d1 = new Developer("Raju","Tcs",10,"Java Full Stack",550000,"BE Computer","Finance",3,"Senior Developer","Payment gateway",10);
		
		d1.displayAllDetail();
		
		d1.displaySoftwareEngineer();
		d1.displayDeveloper();
	}
}
