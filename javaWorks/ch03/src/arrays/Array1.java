package arrays;

public class Array1 {

	public static void main(String[] args) {
		// 정수 10개를 저장할 배열 선언
		int[] arr = new int[5];
		// 값을 추가
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[0]);
		System.out.println("배열의 길이(크기): " + arr.length);	// 5
		
		// 값 수정(변경)
		arr[2] = 7;
		
		// 배열 전체 출력
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// 5개의 크기를 가진 정수형 배열 선언
		int[] arr2 = {2, 4, 6, 8, 10};
		System.out.println(arr2[0]);
		
		// 4번 인덱스 값을 100으로 변경
		arr2[4] = 100;
		
		// 전체 출력
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		// 2와 4 더하기
		int sumV = arr2[0] + arr2[1];
		System.out.println(sumV);
		
		// 2와 4의 크기 비교
		System.out.println(arr2[0] > arr2[1]);
	}

}
