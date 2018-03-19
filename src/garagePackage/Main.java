package garagePackage;

public class Main {

	public static void main(String[] args) {
		Car Audi = new Car("Audi", "Black", 1, true);
		// Audi.setSprayCost(1000);
		Ford Fiesta = new Ford("Fiesta", "Grey", 2, false);
		// Fiesta.setInsuranceCost(2000);
		Motorcycle Bmw = new Motorcycle("Bmw", "Red", 3, true);
		// Bmw.setCanWheely(true);

		// Mercedes.setSprayCost(120);

		Garage deepisGarage = new Garage();

		deepisGarage.deepisGarage.add(Audi);
		deepisGarage.deepisGarage.add(Fiesta);
		deepisGarage.deepisGarage.add(Bmw);

		deepisGarage.removeByName("Fiesta");
		deepisGarage.showCars();
		deepisGarage.calculateVehicle();

	}

}
