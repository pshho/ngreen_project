package abstractex.car;

public class Truck extends Car {
	
	public Truck() {
		this.brand = "트럭";
	}
	
	public void load() {
		System.out.println("트럭이 짐을 싣다.");
	}

	@Override
	public void run() {
		System.out.println("트럭이 달리다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 충전하다.");
	}

}
