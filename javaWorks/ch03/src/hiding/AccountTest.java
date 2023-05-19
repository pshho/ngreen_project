package hiding;

public class AccountTest {
	
	public static void main(String[] args) {
		// 계좌 객체 생성
		Account a1 = new Account("1000-1234", "이몽룡", 50000);
		Account a2 = new Account("9876-5431", "박성호", 1000);
		
		// a1.ano = "1001-1234";
		System.out.println(a1.getAno());
		System.out.println(a1.getOwner());
		System.out.println(a1.getBalance());
		
		System.out.println();
		
		a1.setAno("2000-1234");
		a1.setOwner("홍길동");
		a1.setBalance(30000);
		
		System.out.println(a1.getAno());
		System.out.println(a1.getOwner());
		System.out.println(a1.getBalance());
		
		System.out.println();
		
		System.out.println(a2.getAno());
		System.out.println(a2.getOwner());
		System.out.println(a2.getBalance());
		
	}

}
