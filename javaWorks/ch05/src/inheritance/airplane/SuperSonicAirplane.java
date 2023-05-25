package inheritance.airplane;

public class SuperSonicAirplane extends Airplane {
	
	// 비행 모드 1 - 일반 비행, 2 - 초음속 비행
	static final int NOMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NOMAL;
	
	// 메서드 재정의
	@Override
	public void fly() {
		// 조건문 - 비행기가 초음속비행합니다.
		// super.fly();	// 비행기가 비행합니다.
		
		if(flyMode == SUPERSONIC) {
			System.out.println("비행가기 초음속 비행합니다.");
		}else {
			super.fly();	// fly() 메서드 상속 받음
		}
		
	}

}
