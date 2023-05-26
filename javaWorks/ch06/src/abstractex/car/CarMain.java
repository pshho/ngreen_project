package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Bus();
		Car car2 = new Truck();
		
		// car1.run();
		// car1.refuel();
		carRun(car1);
		carRefuel(car1);
		car1.showInfo();
		
		System.out.println();
		
		// car2.run();
		// car2.refuel();
		carRun(car2);
		carRefuel(car2);
		car2.showInfo();
		
		System.out.println();
		
		// 다운 캐스팅(강제 형변환 - instanceof)
		if(car1 instanceof Bus) {
			Bus bus = (Bus) car1;
			bus.takePassenger();
		}
		
		if(car2 instanceof Truck) {
			Truck truck = (Truck) car2;
			truck.load();
		}
	}
	
	public static void carRun(Car car) {
		car.run();
	}
	
	public static void carRefuel(Car car) {
		car.refuel();
	}

}
