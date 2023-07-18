package collections.map;

public class CarMain {

	public static void main(String[] args) {
		// CarFactory 생성
		CarFactory factory = CarFactory.getInstance();
		
		// 자동차 생성
		Car ionic5 = factory.createCar("전기차");
		Car ionic6 = factory.createCar("전기차");
		
		System.out.println(ionic5);
		System.out.println(ionic6);
		//객체의 주소 비교("==" 사용), type이 같아서 중복 생성 안됨(유일)
		System.out.println(ionic5 == ionic6);  
		
		Car suso1 = factory.createCar("수소차");
		Car suso2 = factory.createCar("수소차");
		System.out.println(suso1 == suso2);  //true
		
		System.out.println(ionic5 == suso1);
	}
}
