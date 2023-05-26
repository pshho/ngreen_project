package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// 추상클래스 객체 생성 X
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("이지능");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.call();
		smartPhone.powerOff();
		
	}

}
