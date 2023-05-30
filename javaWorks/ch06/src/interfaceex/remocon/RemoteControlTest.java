package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 부모 타입으로 객체 생성
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);	// 무음 처리
		tv.setMute(false);	// 무음 해제
		tv.setVolume(7);
		tv.turnOff();
		// 인터페이스 이름으로 직접 접근
		RemoteControl.changeBattery();
		
		System.out.println();
		
		audio.turnOn();
		audio.setVolume(8);
		audio.setMute(true);
		audio.setMute(false);
		audio.setVolume(3);
		audio.turnOff();
		// 인터페이스 이름으로 직접 접근
		RemoteControl.changeBattery();
	}

}
