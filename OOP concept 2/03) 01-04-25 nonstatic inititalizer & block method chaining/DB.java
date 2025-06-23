class DB
{
	String username;
	String password;

	public DB set(String un, String pass)
	{
		username = un;
		password = pass;
		return this;
	}

	public DB showDetail()
	{
		System.out.println(username);
		System.out.println(password);
		return this;
	}
}
