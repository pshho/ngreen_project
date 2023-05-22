package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		
		// 5행 5열의 2차원 배열 생성 - 문자입력
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length-i; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] a2 = new int[5][5];
		
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<a2[i].length; j++) {
				a2[i][j] = 5 * i + (j + 1);
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
