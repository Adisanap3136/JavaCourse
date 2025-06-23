package principleOfOop;

public class Cover_LazyBinding {
	boolean cover;
	public Cover_LazyBinding() {
	}
	
	public Cover_LazyBinding(boolean cover) {
		this.cover = cover;
	}

	public void displayCover()
	{
		System.out.println("Cover details: "+cover);
	}
}
