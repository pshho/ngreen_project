package interfaceex.remocon;

// RemoteControl, Searchable을 구현한 클래스
public class SmartTv implements RemoteControl, Searchable {
	
	private int volume;

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.printf("현재 볼륨은 %d입니다.\n", this.volume);
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
