package arrays;

public class ArrayParam {

	public static void main(String[] args) {
		// 더하기 기능 함수 호출
		// ArrayParam ap = new ArrayParam();	// ap - 힙 메모리 영역
		
		int val = add(4, 5);
		
		System.out.println(val);
		
		// 배열 생성 후 매개변수로 add()에 전달
		int[] num = {1, 2, 3, 4};
		
		System.out.println(add(num));
		
		for(int i=0; i<add2(num).length; i++) {
			System.out.print(add2(num)[i] + " ");
		}
		
	}
	
	/**
	 * 더하기 기능 함수 - 매개변수로 변수 활용
	 * - static을 붙이는 이유는 객체 생성해서 호출하지 않고 직접 호출하기 위해
	 * - static은 정적 메모리 영역
	 */
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 매개변수로 배열 활용
	public static int add(int[] value) {
		int sumV = 0;
		
		for(int i=0; i<value.length; i++) {
			sumV += value[i];
		}
		
		return sumV;
	}
	
	// 2의 배수 배열에 저장 함수
	public static int[] add2(int[] value) {
		int[] value2 = new int[value.length];
		
		for(int i=0; i<value.length; i++) {
			value2[i] += value[i] * 2;
		}
		
		return value2;
	}

}
