package taketrans;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person inbi = new Person("박인비", 10000);
		Person nara = new Person("이나라", 20000);
		Person gangnam = new Person("강남", 15000);
		
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Subway sub1 = new Subway("1호선");
		
		// 사람이 버스를 탄다
		inbi.takeBus(bus100);
		nara.takeBus(bus100);
		gangnam.takeBus(bus100);
		inbi.takeSubway(sub1);
		nara.takeSubway(sub1);
		gangnam.takeSubway(sub1);
		
		// 사람 정보
		inbi.showInfo();
		nara.showInfo();
		gangnam.showInfo();
		
		System.out.println();
		
		// 버스, 지하철 정보
		bus100.showInfo();
		sub1.showInfo();
		
	}

}
