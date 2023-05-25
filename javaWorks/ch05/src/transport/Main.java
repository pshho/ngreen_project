package transport;

public class Main {

	public static void main(String[] args) {
		
		// 사람 객체
		Person p1 = new Person("조혜원", 30000);
		Person p2 = new Person("안민상", 20000);
		
		// 탈 것 객체
		Vehicle bus740 = new Bus("bus740", 1200);
		Vehicle 카카오택시 = new Taxi("카카오택시 1번", 4800);
		
		// p1.showInfo();
		p1.take(bus740, 300);
		p2.take(bus740, 100);
		p1.take(카카오택시, 1000);
		p2.take(카카오택시, 2800);
		
		p1.showInfo();
		p2.showInfo();
		bus740.showInfo();
		카카오택시.showInfo();
		
	}

}
