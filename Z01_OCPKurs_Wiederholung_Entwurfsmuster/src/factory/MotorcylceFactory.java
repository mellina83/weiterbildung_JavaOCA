package factory;

public class MotorcylceFactory {

	public static Vehicle getVehicle(MotorcycleTypes type) {
		Vehicle vehicle = null;
		switch(type) {
			case mz150:{
				vehicle =  new Motorcycle(2,12,150);
				break;
			}
			case triumph:{
				vehicle =  new Motorcycle(2,40,500);
				break;
			}
			default:{
				vehicle =  new Motorcycle(2,4,50);
				break;
			}
		}
		
		return vehicle;
	}
	
}
