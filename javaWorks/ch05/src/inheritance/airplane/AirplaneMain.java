package inheritance.airplane;

public class AirplaneMain {

	public static void main(String[] args) {
		
		// SuperSonicAirplane 객체 생성
		 SuperSonicAirplane sa = new SuperSonicAirplane();
		 
		 sa.takeOff();
		 sa.fly();
		 
		 // 초음속 비행
		 sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		 sa.fly();
		 
		 // 일반 비행
		 sa.flyMode = SuperSonicAirplane.NOMAL;
		 sa.fly();
		 
		 sa.land();
		
	}

}
