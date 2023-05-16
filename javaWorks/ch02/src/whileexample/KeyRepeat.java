package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 - "계속 반복", 'n'키 - "반복 중단", 이외의 키 - "지원하지 않는 키" 출력
		// key == 'y'(안됨 - 숫자비교만 가능) 문자열 비교 equals() 메소드 사용해야 함
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("계속 하시겠습니까?(y/n) ");
			String key = sc.nextLine();	// String형이므로 ""(쌍따옴표) 사용해야 함
			
			if (key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복");
			}else if (key.equals("n") || key.equals("N")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키");
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
