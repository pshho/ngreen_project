package collections.map;

public class Car {
	
	String type;
	
	//기본 생성자 - 매개변수가 없는 생성자
	//이름이 같고 매개변수가 다른 생성자 허용 - 생성자 오버로딩
	public Car() {}
	
	public Car(String type) {
		this.type = type;
	}
}
