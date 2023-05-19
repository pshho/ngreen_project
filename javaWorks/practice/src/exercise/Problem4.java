package exercise;

import java.util.Scanner;

public class Problem4 {
	
	public static int AddToTotal(int x) {
		return x;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, i;
		for(i=0; i<3; i++) {
			System.out.printf("입력%d: ", i+1);
			int scanf = scan.nextInt();
			// scan.nextLine();
			// System.out.printf("누적: %d \n", AddToTotal(num));
		}
	}

}
