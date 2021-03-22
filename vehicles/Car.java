package vehicles;

import java.awt.Color;

public class Car extends Vehicle {

	int numberOfDoors;
	static final int Wheels = 4;

	public Car(String remainPower, Color color, int numberOfDoors) {
		super(Wheels , remainPower, color, Energy.GASOLINE);
		this.numberOfDoors = numberOfDoors;
	}

	public Car(String remainPower, Color color, int numberOfDoors, Energy PoweredBy) {
		super(Wheels , remainPower, color, PoweredBy);
		this.numberOfDoors = numberOfDoors;
	}	

	public String toString() {
		return this.getClass().getSimpleName() + "[wheels= " + wheels + ", number of doors= " + numberOfDoors + ", color= " + rgbToString(color) +
				", remain power= " + remainPower +  ", Powered by= " + PoweredBy + "]";
	}

	public String rgbToString(Color c) {
		return "[R=" + c.getRed() +
				", G=" + c.getGreen() +
				", B=" + c.getBlue() + "]";
	}

}
