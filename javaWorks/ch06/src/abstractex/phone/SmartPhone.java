package abstractex.phone;

public class SmartPhone extends Phone {
	// field
	
	public SmartPhone(String owner) {
		super(owner);	// 부모 생성자 상속
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	public void call() {
		System.out.println("전화를 합니다.");
	}
}
