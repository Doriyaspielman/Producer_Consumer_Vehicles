package vehicles;

import java.awt.Color;

public class Motocyle extends Vehicle{

    static final int Wheels = 2;

	public Motocyle(String remainPower, Color color) {
		super(Wheels, remainPower, color, Energy.GASOLINE);
	}
	
	public Motocyle(String remainPower, Color color, Energy poweredBy) {
		super(Wheels, remainPower, color, poweredBy);
	}

	public String toString() {
		return this.getClass().getSimpleName() + " [wheels= " + wheels + ", color= " + rgbToString(color) +
				", remain power= " + remainPower +  ", Powered by= " + PoweredBy + "]";
	}

	public String rgbToString(Color c) {
		return "[R=" + c.getRed() +
				", G=" + c.getGreen() +
				", B=" + c.getBlue() + "]";
	}

}
