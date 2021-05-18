package verkaeufer;

import factory.Car;
import factory.CarFactory;
import factory.CarTypes;
import factory.Motorcycle;
import factory.MotorcycleTypes;
import factory.MotorcylceFactory;
import factory.Vehicle;

public class AutoHaus {

	public static void main(String[] args) {
		Vehicle v01 = CarFactory.getVehicle(CarTypes.Nissan);

		System.out.println(v01);
		
		v01 = MotorcylceFactory.getVehicle(MotorcycleTypes.triumph);

		System.out.println(v01);
	}

	public static void waschen(Car car) {
		
	}
	
	public static void waschen(Motorcycle motorcycle) {
		
	}
}
