package abstractex.animal;

// 추상 클래스 Animal
public abstract class Animal {
	
	// field
	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	// 추상 메서드 - 선언부만 있고 구현부 X
	// 상속 받는 클래스에서 반드시 구현해야 함
	public abstract void sound();
	
	public void showInfo() {
		System.out.println("동물의 종류: " + kind);
	}

}
