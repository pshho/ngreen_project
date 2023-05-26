package abstractex.phone;

/**
 * 추상 클래스(상속받는 클래스에게 필드, 
 * 메서드의 이름을 통일적으로 사용할 수 있게 함 - 클래스 추상화)
 */
public abstract class Phone {
	// field
	public String owner;	// 주인
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
