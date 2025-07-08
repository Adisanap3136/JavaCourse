package arrays;

class Server
{
	String name;
	int ip;
	boolean status;
	int clients;
	
	public Server() {}

	public Server(String name, int ip, boolean status, int clients) {
		super();
		this.name = name;
		this.ip = ip;
		this.status = status;
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Server [name=" + name + ", ip=" + ip + ", status=" + status + ", clients=" + clients + "]";
	}
	
}

public class NonStaticTypeArrayServerDB 
{
	public static void main(String[] args) 
	{
		Server s[] = new Server[3];
		
		s[0]= new Server("AWS",11015151,true,405150);
		s[1]= new Server("GCP",11015151,true,405150);
		s[2]= new Server("ALibaba",11015151,true,405150);
		
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}
