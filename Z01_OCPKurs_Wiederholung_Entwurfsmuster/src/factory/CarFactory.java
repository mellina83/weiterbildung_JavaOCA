package factory;

public class CarFactory {

	public static Vehicle getVehicle(CarTypes type) {
		Vehicle vehicle = null;
		switch(type) {
			case ferrarif12:{
				vehicle =  new Car(4,739,6300);
				break;
			}
			case lamborghini:{
				vehicle =  new Car(4,855,6500);
				break;
			}
			case Nissan:{
				vehicle =  new Car(4,144,1599);
				break;
			}
			default:{
				vehicle =  new Car(4,65,1200);
				break;
			}
		}
		
		return vehicle;
	}
	
}
