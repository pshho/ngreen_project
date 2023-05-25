package inheritance.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarArrayList {

	public static void main(String[] args) {
		// 자동차 3대 생성 - ArrayList에 저장
		ArrayList<Car> carList = new ArrayList<>();
		
		// 자동차 객체 3대
		Car car1 = new Car("그랜저", 2300);
		Car car2 = new Car("BMW", 2300);
		Car car3 = new Car("벤츠", 2300);
		
		// 자동차 객체 3대(익명 객체)
		carList.add(new Car("캐스퍼", 2000));
		carList.add(new Car("K5", 1800));
		carList.add(new Car("제네시스", 2500));
		
		// 자동차 객체 3대 출력
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i).carInfo());
		}
		
		// 입력받는 Scanner
		Scanner scan = new Scanner(System.in);
		
		// 자동차 객체 5대 입력 생성
		for(int i=0; i<5; i++) {
			String brand = scan.nextLine();
			int cc = Integer.parseInt(scan.nextLine());
			
			carList.add(new Car(brand, cc));
		}
		
		// 자동차 객체 5대 출력
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i).carInfo());
		}
		
		scan.close();
	}

}
