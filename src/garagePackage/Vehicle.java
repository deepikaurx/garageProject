package garagePackage;

public abstract class Vehicle {

     private String name;
     private String color;
     private int id;
     
     
	
	
	
	public Vehicle(String name, String color, int id) {
		this.name=name; 
		this.color=color; 
		this.id=id;
		
		
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}

	


}
