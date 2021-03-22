package vehicles;

import java.awt.Color;

public class Truck extends Vehicle{
	
	static final int Wheels = 18;
	String cargoAttached;

    public Truck(String remainPower, Color color, String cargoAttached) {
		super(Wheels, remainPower, color, Energy.DIESEL);
		this.cargoAttached = cargoAttached;
	}
    
	public String toString() {
		return this.getClass().getSimpleName() + "[wheels= " + wheels + ", color= " + rgbToString(color) +
				", remain power= " + remainPower +  ", Powered by= " + PoweredBy + ", cargo attached= " + cargoAttached + "]";
	}

	public String rgbToString(Color c) {
		return "[R=" + c.getRed() +
				", G=" + c.getGreen() +
				", B=" + c.getBlue() + "]";
	}

}
