package vehicles;

import java.awt.Color;

public abstract class Vehicle {

	int wheels;
	String remainPower;
	Color color;
	Energy PoweredBy;
	
    enum Energy {
        ELECTRICITY,
        GASOLINE,
        DIESEL
    }

	public Vehicle(int wheels, String remainPower, Color color, Energy poweredBy) {
		super();
		this.wheels = wheels;
		this.remainPower = remainPower;
		this.color = color;
		PoweredBy = poweredBy;
	}
}

