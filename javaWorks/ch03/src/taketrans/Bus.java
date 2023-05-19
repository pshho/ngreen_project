package taketrans;

public class Bus {
	int busNumber;		// 버스번호
	int passenger;	// 승객수
	int money;			// 수입
	
	// 생성자
	Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 사람을 태우는 기능을 하는 메소드
	void take(int money) {
		this.money += money;
		passenger++;	// passenger += 1;
		
	}
	
	// 버스 정보
	void showInfo() {
		System.out.printf("%d번 버스 수입: %,d원, 승객수: %d명\n", 
				busNumber, money, passenger);
	}
}
