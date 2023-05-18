package arrays;

public class ArrayCopy1 {

	public static void main(String[] args) {
		/**
		 * 배열의 복사
		 * 1. 기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들 때
		 * 2. 배열의 모든 요소에 자료가 꽉 차서 더 큰 배열을 만들 때
		 */
		// int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];	// arr1을 arr2에 복사함
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		// 2. clone() 메소드
		int[] arr3 = new int[arr1.length];
		arr3 = arr1.clone();
		
		// 향상된 for구문
		for(int i : arr3)
			System.out.print(i + " ");
		
		System.out.println();
		// 3. System 클래스의 arraycopy() 메소드
		int[] arr4 = new int[arr1.length];
		// arraycopy(원본배열, 읽기시작할위치, 사본배열, 쓰기시작할위치, 배열크기)
		System.arraycopy(arr1, 0, arr4, 0, 5);
		
		for(int i : arr4)
			System.out.print(i + " ");
		
	}

}
