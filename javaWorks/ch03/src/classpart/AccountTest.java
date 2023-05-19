package classpart;

import hiding.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		// 계좌 객체 생성
		Account account = new Account("5555-1234", "강남", 1000000);
				
		// a1.ano = "1001-1234";
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());
	}

}
