package abstractex.car;

public abstract class Car {
	
	protected String brand;
	
	// 추상 메서드
	public abstract void run();
	
	public abstract void refuel();
	
	// 실체 메서드
	public static void stop() {
		System.out.println("멈추다.");
	}
	
	public void showInfo() {
		System.out.println("차의 종류: " + brand);
	}

}
