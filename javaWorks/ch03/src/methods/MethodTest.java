package methods;

// MethodEx 클래스
class MethodEx {
	// sayHello() 함수
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	/**
	 * 이름이 매개변수인 sayHello2() 함수
	 * public String sayHello2(String x) {
	 * 		return x + " Hello~";
	 * }
	 */
	public void sayHello2(String name) {
		System.out.println("Hello~ " + name);
	}
	
	// 두 수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}
}

class SayBye {
	public static void sayBye() {
		System.out.println("Bye~");
	}
}

public class MethodTest {

	public static void main(String[] args) {
		// sayHello() 사용(호출)
		MethodEx method = new MethodEx();
		method.sayHello();	// 객체이름.함수이름
		
		// add() 호출
		System.out.println(method.add(10, 20));
		
		// sayHello2() 호출
		method.sayHello2("이강");
		method.sayHello2("연아");
		
		// SayBye 클래스 sayBye() 호출
		SayBye.sayBye();
	}

}
