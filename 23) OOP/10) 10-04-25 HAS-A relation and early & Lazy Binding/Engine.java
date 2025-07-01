public class Engine{
	int cc;
	int stroke;
	double torque;

	public Engine() {
	}

	public Engine(int cc,int stroke,double torque)
	{
		this.cc=cc;
		this.stroke=stroke;
		this.torque=torque;
		System.out.println("Engine built successfully!");
	}

	public void displayEngine()
	{
		System.out.println("CC: "+cc);
		System.out.println("Stroke: "+stroke);
		System.out.println("Torque: "+torque);
	}
}