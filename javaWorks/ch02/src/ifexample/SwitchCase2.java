package ifexample;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// case구문 동시에 사용하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월입니까? ");
		int month = sc.nextInt();
		int day = 0;
		
		sc.close();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return;	// 프로그램 즉시 종료
		}
		
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
	}

}
