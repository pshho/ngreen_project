package transport;

// 사람 클래스(참조 자료형)
public class Person {
	String name;
	int money;	// 가진 돈
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 요금을 내고 교통수단을 이용하는 메서드
	// Vehicle vehicle → 상속과 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee + vehicle.getMoney();	// 가진 돈 - 요금
	}
	
	// 사람 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈: %,d원\n", 
				name, money);
	}

}