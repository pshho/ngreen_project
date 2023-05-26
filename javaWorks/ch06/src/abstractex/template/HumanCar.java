package abstractex.template;

public class HumanCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 차를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 차를 세웁니다.");
	}

}
