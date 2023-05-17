package whileexample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행 업무 - 예금, 출금, 잔고확인 등
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;	// 은행 잔고
		
		while (run) {
			System.out.println("====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 확인 | 4. 종료");
			System.out.println("====================================");
			System.out.print("선택(숫자 입력)> ");
			
			// 숫자 변환(정수형)
			int selNum = 0;
			int money = 0;
			
			try {
				selNum = Integer.parseInt(sc.nextLine());
			}catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			
			
			switch (selNum) {
			case 1:
				System.out.print("예금액> ");
				
				try {
					money = Integer.parseInt(sc.nextLine());
				}catch (NumberFormatException e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				}
				
				// 잔고 = 잔고 + 예금액
				balance += money;
				System.out.printf("%,d원 정상예금 되었습니다.\n", money);
				break;
			case 2:
				System.out.print("출금액> ");
				
				try {
					money = Integer.parseInt(sc.nextLine());
				}catch (NumberFormatException e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				}
				
				balance -= money;
				
				if (balance < 0) {
					balance += money;
					System.out.println("잔고가 부족합니다.");
				}else {
					System.out.printf("%,d원 정상출금 되었습니다.\n", money);
				}
				break;
			case 3:
				System.out.printf("잔고> %,d원\n", balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("메뉴를 정확히 선택해주세요.");
				break;
			}
		}
		
		sc.close();
	}

}
