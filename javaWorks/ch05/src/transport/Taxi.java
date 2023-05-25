package transport;

public class Taxi extends Vehicle {
	
	int staticMoney;

	public Taxi(String vehicleName, int staticMoney) {
		super(vehicleName, staticMoney);
	}
	
	@Override
	public void carry(int money) {
		super.carry(money);
	}
	
}
