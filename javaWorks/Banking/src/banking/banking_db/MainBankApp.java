package banking.banking_db;

import java.util.Scanner;

public class MainBankApp {
	
	static AccountDAO dao = new AccountDAO();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("=============================================================");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 계좌 삭제 | 6. 종료");
			System.out.println("=============================================================");
			
			// 메뉴 선택 변수
			System.out.print("선택> ");
			String selectNo = scanner.nextLine();
			
			if(selectNo.equals("1")) {
				
				dao.createAccount();
				
			}else if(selectNo.equals("2")) {
				
				dao.getAccountList();
				
			}else if(selectNo.equals("3")) {
				
				dao.deposit();
				
			}else if(selectNo.equals("4")) {
				
				dao.withdraw();
				
			}else if(selectNo.equals("5")) {
				
				dao.deleteAccount();
				
			}else if(selectNo.equals("6")) {
				System.out.println("프로그램 종료");
				run = false;
				
			}else {
				
				System.out.println("지원되지 않는 기능입니다.");
				
			}
			
		}
		// while() 끝
		
	}
	// main 함수 끝

}
