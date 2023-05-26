package abstractex.template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("차량이 자율주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차량이 자동으로 멈춥니다.");
	}
	
	/*
	 * run()을 재정의(override - 오버라이딩) 할 수 없음
	 * public void run() {}
	 */

}
