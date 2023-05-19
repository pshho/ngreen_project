package taketrans;

// 사람 클래스(참조 자료형)
public class Person {
	String name;
	int age;
	int money;	// 가진 돈
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스타는 기능 메소드
	// 매개변수 - 자료형 변수 이름
	void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
	}
	
	// 지하철 타는 기능 메소드
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 사람 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈: %,d원\n", 
				name, money);
	}

}
