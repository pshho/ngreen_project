package abstractex.car;

public class Bus extends Car {
	
	public Bus() {
		this.brand = "버스";
	}
	
	public void takePassenger() {
		System.out.println("버스가 승객을 태운다.");
	}

	@Override
	public void run() {
		System.out.println("버스가 달리다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연가스 충전하다.");
	}
	
	

}
