package interfaceex.tire;

public class Car2 {
	
	// field
	Tire[] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire()
	};
	
	// 메서드
	public void run() {
		/*
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
		*/
		
		for(Tire tire : tires) {
			tire.roll();
		}
		
	}
	
}
