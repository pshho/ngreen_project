package taketrans;

public class Subway {
	String lineNumber;
	int passenger;
	int money;
	
	Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	void take(int money) {
		this.money += money;
		passenger++;
		
	}
	
	void showInfo() {
		System.out.printf("%s 지하철 수입: %,d원, 승객수: %d명\n", 
				lineNumber, money, passenger);
		
	}

}
