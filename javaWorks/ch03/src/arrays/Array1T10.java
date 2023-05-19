package arrays;

public class Array1T10 {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - 변수 사용
		for(int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1부터 10까지 출력 - 배열 사용
		int[] arr1 = new int[10];
		int sumV = 0;
		
		for(int i=0; i<10; i++) {
			arr1[i] = i + 1;
			sumV += arr1[i];
			System.out.printf("i=%d, sumV=%d\n", arr1[i], sumV);
		}
		
		System.out.println("합계: " + sumV);
		
	}

}
