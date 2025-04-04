class FormDriver
{
	public static void main(String[] args)
	{
		Form f1 = new Form();
		f1.displayForm();

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

		Form f2 = new Form("Raju",1354584745l,'M',"12/12/12");
		f2.displayForm();

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

		Form f3 = new Form("Joy",343545444l,'M',"02/02/12",13213548l);
		f3.displayForm();

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

		Form f4 = new Form("Indumati",657488794l,'F',"01/01/11",98745545l,"A-ve");
		f4.displayForm();

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

		Form f5 = new Form("Rani",918625652l,'F',"08/09/10",1354884684l,"O+ve","rani@gmail.com");
		f5.displayForm();

	}
}

/* op:-
Name: null
Phone no: 0
Tel no: 0
Gender:
Blood gr: null
Email: null
DOB: null
- - - - - - - - - - - - - - - - - - - - - - -
Name: Raju
Phone no: 1354584745
Tel no: 0
Gender: M
Blood gr: null
Email: null
DOB: 12/12/12
- - - - - - - - - - - - - - - - - - - - - - -
Name: Joy
Phone no: 343545444
Tel no: 13213548
Gender: M
Blood gr: null
Email: null
DOB: 02/02/12
- - - - - - - - - - - - - - - - - - - - - - -
Name: Indumati
Phone no: 657488794
Tel no: 98745545
Gender: F
Blood gr: A-ve
Email: null
DOB: 01/01/11
- - - - - - - - - - - - - - - - - - - - - - -
Name: Rani
Phone no: 918625652
Tel no: 1354884684
Gender: F
Blood gr: O+ve
Email: rani@gmail.com
DOB: 08/09/10
- - - - - - - - - - - - - - - - - - - - - - -
*/