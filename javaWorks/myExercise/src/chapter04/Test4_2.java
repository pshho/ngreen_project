package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(4 * i + 5 * j == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
			
		}
		
		System.out.println();
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i < j) {
					System.out.printf(" ");
				}else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
