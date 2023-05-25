package transport;

public class Vehicle {
	
	// field
	String vehicleName;	// 차량 이름
	int money;			// 수입
	private int staticMoney;
	int passengerCount; // 승객수
	
	// 생성자
	public Vehicle(String vehicleName, int staticMoney) {
		this.vehicleName = vehicleName;
		this.staticMoney = staticMoney;
	}
	
	// 운송(메서드) - 수입, 승객수 증가
	public void carry(int money) {
		this.money += money + staticMoney;
		this.passengerCount++;
	}
	
	public int getMoney() {
		return staticMoney;
	}
	
	// 차량의 정보 출력
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d원, 승객수는 %,d명\n", 
				vehicleName, money, passengerCount);
	}

}
