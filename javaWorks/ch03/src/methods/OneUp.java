package methods;

public class OneUp {

	// 숫자 1 증가 함수
	public static int oneUp() {
		
		// x는 값 반환 후 소멸
		int x = 0;
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());	// 1
		System.out.println(oneUp());	// 1
		
		// x값 확인
		// System.out.println(x);	// 컴파일 오류(x를 변수 선언 및 할당하지 않아서)
		
	}

}
