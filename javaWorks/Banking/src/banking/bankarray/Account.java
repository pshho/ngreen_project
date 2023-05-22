package banking.bankarray;

public class Account {
	
	private String ano;		// 계좌번호
	private String owner;	// 계좌주
	private int balance;	// 잔고

	public Account(String owner, int balance) {
		
		String random = "";
		
		for(int i=0; i<8; i++) {
			
			int num = (int)(Math.random() * 9) + 1;
			random += "" + num;
			
		}
		
		ano = random;
		
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public String getAno() {
		
		return ano;
		
	}
	
	public String getOwner() {
		
		return owner;
		
	}
	
	public int getBalance() {
		
		return balance;
		
	}
	
}
