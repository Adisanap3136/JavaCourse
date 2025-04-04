class Form            //real life exmple of google form (Constructor OverLoading)
{
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;

	Form(){}

	Form(String name,long phno,char gen,String dob)  //mandetory fields in form
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}

	Form(String name,long phno,char gen,String dob,long tel)   //include mandetory with non mandetory fields
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
		this.tel=tel;
	}

	Form(String name,long phno,char gen,String dob,long tel,String blood)    //include mandetory with non mandetory fields
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
		this.tel=tel;
		this.blood=blood;
	}

	Form(String name,long phno,char gen,String dob,long tel,String blood,String email)  //All fields
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
		this.tel=tel;
		this.blood=blood;
		this.email=email;
	}

	public void displayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone no: "+phno);
		System.out.println("Tel no: "+tel);
		System.out.println("Gender: "+gen);
		System.out.println("Blood gr: "+blood);
		System.out.println("Email: "+email);
		System.out.println("DOB: "+dob);
	}
}
