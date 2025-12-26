package car.factory;

import car.Car;
import car.ext.Mustang;
import car.ext.Sonata;

public class CarFactory {
	Car makeCar(String name) {
		if ("sonata".equals(name)) {
			return new Sonata();
		}
		if ("mustang".equals(name)) {
			return new Mustang();
		}
		return new Car();
		
	}
	
}
