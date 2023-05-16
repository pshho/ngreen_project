package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// try ~ catch 예외 처리
		// 예외: 프로그램 실행 시 오류
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자를 입력해주세요: ");
			int num = scan.nextInt();
			String result = "";
			
			if (num % 2 == 0) {
				result = "짝수입니다.";
				System.out.println(result);
			}else {
				result = "홀수입니다.";
				System.out.println(result);
			}
			// String evenOdd = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
			// System.out.println(evenOdd);
			
			scan.close();
		}catch(Exception e) {
			System.out.println("숫자를 입력해주세요.");
		}
	}

}
