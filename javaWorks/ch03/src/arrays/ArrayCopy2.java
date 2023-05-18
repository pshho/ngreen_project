package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[arr1.length];
		
		// 배열 복사
		arr2 = arr1.clone();
		for(int i : arr2)
			System.out.print((char)i + " ");
		
		System.out.println();
		// 역순 복사 N E T → T E N
		char[] arr3 = new char[arr1.length];
		for(int i=2; i>=0; i--) {
			arr3[2-i] = arr1[i];
			System.out.print(arr3[2-i] + " ");
		}
	}

}
