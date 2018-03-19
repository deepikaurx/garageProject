package garagePackage;

public class Ford extends Vehicle {


	private boolean goesSlow;

	public Ford(String name, String color, int id, boolean goesSlow) {
		super(name, color, id);
		this.goesSlow = goesSlow;
	}

	

	public boolean getgoesSlow() {
		return goesSlow;
	}
	
	
	public void setgoesSlow(boolean b) {
		this.goesSlow = b;
	}
	
}
	
	