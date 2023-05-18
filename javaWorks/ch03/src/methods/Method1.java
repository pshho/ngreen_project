package methods;

public class Method1 {

	public static void main(String[] args) {
		/**
		 * 객체(클래스에서 만드는 인스턴스) - 메모리 로딩됨
		 * 클래스 객체 생성 방법
		 * 1. new 키워드 사용(Scanner sc = new Scanner)
		 * 2. Math.round() - static(Math 클래스가 static으로 되어 있어 사용할 수 있음)
		 */
		Method1 method = new Method1();
		
		// 클래스 이름은 패키지이름부터 시작됨(methods.Method1@365185bd - 패키지이름.인스턴스이름)
		System.out.println(method);
		
		// 함수 호출
		Method1.sayHello();
		System.out.println(Method1.square(3));
	}
	
	/**
	 * static - 정적 영역(값을 누적, 공유 - python에서 함수의 global 전역 변수와 유사)
	 * sayHello() 함수(return이 없는 함수 - void)
	 * 호출하는 쪽에서 new 객체 생성을 하지 않고 바로 사용하고 싶을 때 static 붙임
	 */
	public static void sayHello() {
		System.out.println("Hello~");
	}
	
	// 제곱수 계산 함수(return이 있는 함수 - int형으로 반환)
	public static int square(int x) {
		return x * x;
	}
}
