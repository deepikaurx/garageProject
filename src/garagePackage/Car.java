package garagePackage;

public class Car extends Vehicle {
	
	private boolean goesFast;

	

	public Car(String name, String color, int id, boolean goesFast) {
		super(name, color, id);
		this.goesFast = goesFast;
		// TODO Auto-generated constructor stub
	}

	
	public boolean getgoesFast() {
		return goesFast;
	}
	
	
	public void setgoesFast(boolean b) {
		this.goesFast = b;
	}
	
}