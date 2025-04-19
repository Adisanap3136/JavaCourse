class Server
{
	String status ;
	int ip;
	int portNo;

	public Server displayDetail()
	{
		System.out.println(status);
		System.out.println(ip);
		System.out.println(portNo);
		setDB();
		return this;
	}
	public void setDB()
	{
		DB db1 = new DB();
		status = "UP";
		ip = 1270001;
		portNo = 5000;
		db1.set("Root","Admin123").showDetail();
	}
}
