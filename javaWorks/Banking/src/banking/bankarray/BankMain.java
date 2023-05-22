package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("=================================================");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");
			
			// 메뉴 선택 변수
			System.out.print("선택> ");
			String selectNo = scanner.nextLine();
			
			if(selectNo.equals("1")) {
				
				createAccount();
				
			}else if(selectNo.equals("2")) {
				
				viewAccount();
				
			}else if(selectNo.equals("3")) {
				
				// saveAccount();
				
			}else if(selectNo.equals("5")) {
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
			
		}
		// while() 끝
		
	}
	// main 함수 끝
	
	// 계좌를 생성하는 함수
	private static void createAccount() {
		
		System.out.println("=================================================");
		System.out.println("1. 계좌 생성");
		System.out.println("=================================================");
		
		// System.out.print("계좌번호: ");
		// String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기 입금액: ");
		String balance = scanner.nextLine();
		
		// 첫 번째 계좌 생성
		for(int i=0; i<accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				String random = accountNumber();
				
				accountArray[i] = new Account(random, owner, Integer.parseInt(balance));
				System.out.println("결과: 계좌가 정상적으로 생성되었습니다.");
				break;
				
			}
			
		}
		
	}
	
	// 계좌 목록 보여주는 함수
	private static void viewAccount() {
		
		System.out.println("=================================================");
		System.out.println("2. 계좌 목록");
		System.out.println("=================================================");
		
		for(int i=0; i<accountArray.length; i++) {
			
			if(accountArray[i] != null) {
				
				String formatNumber = accountArray[i].getAno();
				formatNumber = formatNumber.substring(0, 3) + 
						"-" + formatNumber.substring(3, 7) + "-" +
						formatNumber.substring(7, 10);
				
				System.out.println("계좌번호: " + formatNumber);
				System.out.println("계좌주: " + accountArray[i].getOwner());
				System.out.printf("예금액: %,d\n", accountArray[i].getBalance());
				System.out.println();
				
			}
			
		}
		
	}
	
	// 계좌에 예금을 저장하는 함수
//	private static void saveAccount() {
//		
//		
//		
//	}
	
	// 계좌번호 랜덤 생성
	
	private static String accountNumber() {
		
		while(true) {
			
			String random = "";
			int stackNum = 265;
			random = "" + stackNum;
			
			for(int i=0; i<7; i++) {
				
				int num = (int)(Math.random() * 9) + 1;
				random += "" + num;
				
			}
			
			for(Account account : accountArray) {
				if(account != null && account.getAno().equals(random)) {
					break;
				}
			}
			
			return random;
			
		}
		
	}

}
