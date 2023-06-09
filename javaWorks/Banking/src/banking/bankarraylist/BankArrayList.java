package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
// import java.util.regex.*;
import java.util.regex.Pattern;

public class BankArrayList {
	
	// 통장 계좌를 만들 ArrayList 생성
	static ArrayList<Account> accountlist = new ArrayList<>();
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
				
				deposit();
				
			}else if(selectNo.equals("4")) {
				
				withdraw();
				
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
		
		String random = accountNumber(accountlist.size());
		
		Account account = new Account(random, owner, Integer.parseInt(balance));
		
		accountlist.add(account);
		
		System.out.println("결과: 계좌가 정상적으로 생성되었습니다.");
		
	}
	
	// 계좌 목록 보여주는 함수
	private static void viewAccount() {
		
		System.out.println("=================================================");
		System.out.println("2. 계좌 목록");
		System.out.println("=================================================");
		
		for(int i=0; i<accountlist.size(); i++) {
			
			if(accountlist.get(i) != null) {
				
				String formatNumber = accountlist.get(i).getAno();
				formatNumber = formatNumber.substring(0, 3) + 
						"-" + formatNumber.substring(3, 7) + "-" +
						formatNumber.substring(7, 10);
				
				System.out.println("계좌번호: " + formatNumber);
				System.out.println("계좌주: " + accountlist.get(i).getOwner());
				System.out.printf("예금액: %,d\n", accountlist.get(i).getBalance());
				System.out.println();
				
			}
			
		}
		
	}
	
	// 계좌번호 맨 앞자리(구분자)
	static int stackNum = 265;
	
	// 계좌번호 랜덤 생성
	private static String accountNumber(int i) {
		
		while(true) {
			
			String random = "";
			
			random = "" + stackNum;
			
			if((i+1) % 5 == 0) {
				
				stackNum++;
				
			}
			
			for(int j=0; j<7; j++) {
				
				int num = (int)(Math.random() * 9) + 1;
				random += "" + num;
				
			}
			
			for(Account account : accountlist) {
				
				if(account != null && account.getAno().equals(random)) {
					
					break;
					
				}
				
			}
			
			return random;
			
		}
		
	}
	
	// 계좌를 검색하는 메소드
	private static Account findAccount(String ano) {
		
		// 빈 계좌를 할당
		Account account = null;
		
		for(int i=0; i<accountlist.size(); i++) {
			
			if(accountlist.get(i) != null) {
				
				// 이미 저장된 계정
				String dbAno = accountlist.get(i).getAno();
				
				// 문자열 비교
				if(dbAno.equals(ano)) {
					
					// 계좌를 가져와 저장
					account = accountlist.get(i);
					break;
					
				}
				
			}
			
		}
		
		return account;
		
	}
	
	private static void deposit() {
		
		System.out.println("=================================================");
		System.out.println("3. 예금");
		System.out.println("=================================================");
		
		for(int i=0; i<accountlist.size(); i++) {
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(ano);
			
			String b = "";
			
			while(matcher.find()) {
				
				// System.out.println(matcher.group());
				b += matcher.group();
				
			}
			
			if(findAccount(b) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				
				System.out.print("입금액: ");
				String balance = scanner.nextLine();
				int money = Integer.parseInt(balance);
					
				// 예금: 잔고 + 예금액
				Account account = findAccount(b);
				account.setBalanceAdd(money);
				
				System.out.println("정상처리되었습니다.");
				
				i = accountlist.size();
				
			}else {
				
				System.out.println("계좌가 없습니다.");
				i--;
				
			}
			
		}
		
	}
	
	private static void withdraw() {
		
		System.out.println("=================================================");
		System.out.println("4. 출금");
		System.out.println("=================================================");
		
		
		for(int i=0; i<accountlist.size(); i++) {
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(ano);
			
			String b = "";
			
			while(matcher.find()) {
				
				// System.out.println(matcher.group());
				b += matcher.group();
				
			}
			
			if(findAccount(b) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				
				boolean running = true;
				
				while(running) {
					
					System.out.print("출금액: ");
					String balance = scanner.nextLine();
					int money = Integer.parseInt(balance);
					
					// 예금: 잔고 + 예금액
					Account account = findAccount(b);
					account.setBalanceSub(money);
					
					if(account.getBalance() < 0) {
						
						account.setBalanceAdd(money);
						System.out.println("잔액이 부족합니다.");
						
					}else if(account.getBalance() >= 0) {
						
						System.out.println("정상처리되었습니다.");
						running = false;
						
					}
					
					i = accountlist.size();
					
				}
				
			}else {
				
				System.out.println("계좌가 없습니다.");
				i--;
				
			}
			
		}
		
		
	}

}
