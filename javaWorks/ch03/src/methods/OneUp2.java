package methods;

public class OneUp2 {

	// 정적 변수는 프로그램이 종료될 때 소멸하고, 값을 계속 유지(재할당된 값도 - 공유)
	static int x = 0;	// static - 정적 변수
	
	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());	// 1
		System.out.println(oneUp());	// 2
		System.out.println(oneUp());	// 3
		System.out.println(oneUp());	// 4
		
		System.out.println("x = " + x); // 4 - 마지막에 재할당된 4
		
	}

}
