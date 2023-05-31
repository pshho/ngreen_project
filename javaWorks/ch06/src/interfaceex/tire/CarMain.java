package interfaceex.tire;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.run();
		
		System.out.println("===============================");
		
		// 앞바퀴 2개 교체
		car1.frontLeftTire = new KumTire();
		car1.frontRightTire = new KumTire();
		
		car1.run();
		
	}

}
