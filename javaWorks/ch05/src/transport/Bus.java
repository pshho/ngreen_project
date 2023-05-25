package transport;

public class Bus extends Vehicle {

	int staticMoney;
	
	public Bus(String vehicleName, int staticMoney) {
		super(vehicleName, staticMoney);
	}
	
	@Override
	public void carry(int money) {
		super.carry(money);
	}

}
