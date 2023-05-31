package interfaceex.remocon;

public class SmartTvTest {
	
	public static void main(String[] args) {
		
		// smartTv 객체 생성
		SmartTv stv = new SmartTv();
		// 부모형으로 형변환
		RemoteControl rc = stv;
		Searchable sc = stv;
		
		stv.turnOn();
		stv.search("www.google.com");
		stv.setVolume(7);
		stv.setMute(true);
		stv.setMute(false);
		stv.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println("=================================");
		
		rc.turnOn();
		sc.search("www.naver.com");
		rc.setVolume(3);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		RemoteControl.changeBattery();
		
	}
}
