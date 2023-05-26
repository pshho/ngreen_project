package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 부모 타입으로 객체 생성
		RemoteControl tv = new Television();
		
		tv.turnOn();
		tv.setVolume(-20);
		tv.turnOff();
	}

}
