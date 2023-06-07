package clone;

public class CloneTest {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int[] arr3 = new int[arr1.length];
		
		// arr1을 arr3으로 복사
		arr3 = arr1.clone();
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
	
}
