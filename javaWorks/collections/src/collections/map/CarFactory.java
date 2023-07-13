package collections.map;

import java.util.HashMap;

public class CarFactory {
	// 싱글톤 패턴(static을 사용 - new X)
	private static CarFactory instance;	// 객체 필드
	private HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
			
		return instance;
	}
	
	// 자동차 회사가 자동차를 만드는 method
	public Car createCar(String type) {
		if(carMap.containsKey(type)) {
			return carMap.get(type);
		}
		Car car = new Car();	// 차 객체
		carMap.put(type, car);	// type과 car 저장(생성)
		return car;
	}
}
