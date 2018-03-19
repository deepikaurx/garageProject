package garagePackage;

public class Motorcycle extends Vehicle {


	private boolean swerves;

	public Motorcycle(String name, String color, int id, boolean swerves) {
		super(name, color, id);
		this.swerves = swerves;
		
	}

	public boolean getSwerves() {
		return swerves;
	}
	
	
	public void setSwerves(boolean b) {
		this.swerves = b;
	}
	
}