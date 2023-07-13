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
		System.out.println(ionic6 == ionic5);
		
		Car suso1 = factory.createCar("수소차");
		Car suso2 = factory.createCar("수소차");
		System.out.println(suso1 == suso2);
		
		System.out.println(ionic5 == suso1);
	}
}
