package vehicles;

import java.awt.Color;

public class ElectricCar extends Car{

	static final int ID = 2;

	public ElectricCar(String remainPower, Color color, int numberOfDoors) {
		super(remainPower, color, numberOfDoors, Energy.ELECTRICITY);
	}

	

}
