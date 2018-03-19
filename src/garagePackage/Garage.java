package garagePackage;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> deepisGarage = new ArrayList<>();
	int total = 2100;

	public Garage() {
		
	}
	
	public ArrayList<Vehicle> getdeepisGarage() {
		return deepisGarage;
	}
	
	
	public void showCars() {
		System.out.println("Currently deepi's garage has the following items:");

		for (Vehicle temp : deepisGarage) {
			System.out.println(temp.getName());
		}

	}
	
	
	public void calculateVehicle() {
		for(Vehicle v : deepisGarage ) {
			if(v instanceof Car) {
				int price = v.getId()*7 + v.getId()*50;
				if(((Car)v).getgoesFast()) {
					price+= 3000;
		
				}
				System.out.println("The total is " + price + " to repair" + v.getId() );
			}
		}
		
	}
	
	
	
	
	public void addVehicle(Vehicle v) {
		deepisGarage.add(v);
	}
	

	public void removeVehicle(Vehicle toRemove) {
		deepisGarage.remove(toRemove);

	}

	public void removeByName(String name) {
		for (Vehicle temp : deepisGarage) {
			if (temp.getName() == name) {
				deepisGarage.remove(temp);

			}
			
			
           //    public void removeAll() {
          //  	   deepisGarage.removeAll(toRemove);
			//}
               
               
			

		}

	}

}






