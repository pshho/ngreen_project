package interfaceex.remocon;

public interface RemoteControl {
	
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	// 디폴트 메시지(실체 메서드) - 무음 처리/해제
	default void setMute(boolean mute) {
		if(mute) {	// mute == true
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전기 교환");
	}
	
}
