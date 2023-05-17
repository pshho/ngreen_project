package forexample;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1부터 10까지 출력, 합계
		int sumV = 0;	// 합계를 저장할 변수
		for (int i=1; i<=10; i++) {
			sumV += i;
			// System.out.println("i=" + i + ", sumV=" + sumV);
		}
		
		// System.out.println("합계: " + sumV);
		
		// 문자 세트 - 알파벳 출력(대문자, 기호, 소문자)
		char ch;
		for (ch=65; ch<123; ch++) {
			// System.out.print(ch + " ");
		}
		// System.out.println();
		// 유니코드 - 한글
		for (ch=12593; ch<12686; ch++) {
			// System.out.print(ch + " ");
		}
		
		// 구구단
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		for (int i=1; i<10; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
		
		sc.close();
		
	}

}
