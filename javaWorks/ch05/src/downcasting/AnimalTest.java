package downcasting;

import java.util.ArrayList;

class Animal {
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
}

// Human 클래스
class Human extends Animal {

	@Override
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

// Tiger 클래스
class Tiger extends Animal {
	
	@Override
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

// Eagle 클래스
class Eagle extends Animal {
	
	@Override
	public void breathe() {
		System.out.println("독수리가 숨을 쉽니다.");
	}
	
	public void fly() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
}

public class AnimalTest {
	
	static ArrayList<Animal> animallist = new ArrayList<>();
	
	public static void main(String[] args) {
		
		animallist.add(new Human());	// 0번 인덱스
		animallist.add(new Tiger());	// 1번 인덱스
		animallist.add(new Eagle());	// 2번 인덱스
		
		System.out.println("=== 타입 변환 및 호출 ===");
		testCasting();
		
		/*
		// Human 객체 생성
		Animal human = new Human();
		
		// 생성된 객체 arraylist에 저장
		animallist.add(human);
		
		// System.out.println(animallist.get(0));
		animallist.get(0).breathe();
		*/
		
		/*
		// 부모 타입으로 자동 형변환을 구현
		Animal animal = new Human();
		animal.breathe();
		
		// 다운 캐스팅으로 강제 형변환 발생
		if(animal instanceof Human) {	// animal이 Human의 인스턴스라면
			Human man = (Human) animal;	// 강제 형변환 실행(다운캐스팅 실행)
			man.read();					// 자식 클래스에만 있는 read() 메서드 실행 가능
		}
		*/
	}
	
	public static void testCasting() {
		for(int i=0; i<animallist.size(); i++) {
			// 다형성 - 부모 타입으로 객체 생성
			Animal animal = animallist.get(i);
			
			animal.breathe();
			
			// 하위 클래스의 메서드 사용
			if(animal instanceof Human) {	// animal이 Eagle의 인스턴스라면
				Human man = (Human) animal;	// 자식 객체 = (자식클래스) 부모 객체
				man.read();
			}else if(animal instanceof Tiger) {	// animal이 Tiger의 인스턴스라면
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}else if(animal instanceof Eagle) {	// animal이 Eagle의 인스턴스라면
				Eagle eagle = (Eagle) animal;
				eagle.fly();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}

	}
	
}