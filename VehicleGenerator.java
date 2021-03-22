
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import vehicles.*;


public class VehicleGenerator{

	//generate random vehicle
	public static Vehicle randVehicle() {
		Vehicle vehicle;
		Random r = new Random();
		int randInt = r.nextInt(5) + 1; //choose which vehicle to generate
		switch (randInt) {
		case 1:
			vehicle = new Car(randRemainPower(), randColor(), randNumOfDoors());
			break;
		case 2:
			vehicle = new ElectricCar(randRemainPower(), randColor(), randNumOfDoors());
			break;
		case 3:
			vehicle = new Motocyle(randRemainPower(), randColor());
			break;
		case 4:
			vehicle = new ElectricMotocyle(randRemainPower(), randColor());
			break;
		default:
			vehicle = new Truck(randRemainPower(), randColor(), randCargoAttached());
			break;
		}
		return vehicle;
	}
	
	//random remain power
	private static String randRemainPower() {
		Random r = new Random();
		int randPower = r.nextInt(100); 
		String remainPower = randPower + "%";
		return remainPower;
	}

	//random vehicle color
	private static Color randColor() {
		Color c = new Color((int)(Math.random() * 0x1000000));
		return c;
	}
	
	//random vehicle doors number	
	private static int randNumOfDoors() {
		Random r = new Random();
		int numDoors = r.nextInt(4) + 2;
		return numDoors;
	}

	//random truck cargo
	private static String randCargoAttached() {
		List<String> cargo = new ArrayList<String>();
		cargo.add("food");
		cargo.add("furniture");
		cargo.add("clothes");
	    Random rand = new Random();
	    String randomElement = cargo.get(rand.nextInt(cargo.size()));
	    return randomElement;
	}
}

