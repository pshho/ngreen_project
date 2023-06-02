package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import banking.banking_db.common.JDBCUtil;

public class AccountDAO {
	// field
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	static Scanner scanner = new Scanner(System.in);
	
	// 계좌 생성
	public void createAccount() {
		
		System.out.println("=================================================");
		System.out.println("1. 계좌 생성");
		System.out.println("=================================================");
		
		String random = createAccountNumber(findAllAccount().size());
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		int balance;
		
		while(true) {
			try {
				System.out.print("초기 입금액: ");
				balance = Integer.parseInt(scanner.nextLine());
				
				if(balance >= 0) {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
	
		// DB 연결
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO account(ano, owner, balance) VALUES(?, ?, ?)";
		
		// DB account TABLE에 삽입
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, random);
			pstmt.setString(2, owner);
			pstmt.setInt(3, balance);
			pstmt.executeUpdate();
			System.out.println("결과: 계좌가 정상적으로 생성되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}
	
	// 계좌 목록 보여주는 method
	public void getAccountList() {
		ArrayList<AccountVO> accountList = new ArrayList<>();
		
		System.out.println("=================================================");
		System.out.println("2. 계좌 목록");
		System.out.println("=================================================");
		
		// DB 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		
		// DB account TABLE 불러오기
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				AccountVO account = new AccountVO(ano, owner, balance);
				accountList.add(account);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		// 화면 출력
		for(int i=0; i<accountList.size(); i++) {
			
			String formatNumber = accountList.get(i).getAno();
			formatNumber = formatNumber.substring(0, 3) + 
					"-" + formatNumber.substring(3, 7) + "-" +
					formatNumber.substring(7, 10);
			
			System.out.println("계좌번호: " + formatNumber);
			System.out.println("계좌주: " + accountList.get(i).getOwner());
			System.out.printf("예금액: %,d\n", accountList.get(i).getBalance());
			System.out.println();
			
		}
		
	}
	
	// 계좌번호 랜덤 생성
	public String createAccountNumber(int i) {
		
		// 계좌번호 맨 앞자리(구분자)
		int stackNum = 265;
		
		// 계좌번호 자동생성(10자리)
		while(true) {
			
			String random = "";
			
			random = "" + stackNum;
			
			if(i % 5 == 0) {
				
				stackNum++;
				
			}
			
			for(int j=0; j<7; j++) {
				
				int num = (int)(Math.random() * 9) + 1;
				random += "" + num;
				
			}
			
			for(AccountVO account : findAllAccount()) {
				
				if(account != null && account.getAno().equals(random)) {
					
					break;
					
				}
				
			}
			
			return random;
			
		}
		
	}
	
	// 계좌 1개 검색 method
	public AccountVO findAccount(String ano) {
		
		// 빈 계좌를 할당
		AccountVO account = null;
		
		// DB 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		
		// DB account TABLE 불러오기
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new AccountVO(ano, owner, balance);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return account;
		
	}
	
	// 계좌 전체 검색만 하는 method
	public ArrayList<AccountVO> findAllAccount() {
		ArrayList<AccountVO> accountList = new ArrayList<>();
		
		// DB 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
				
		// DB account TABLE 불러오기
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				AccountVO account = new AccountVO(ano, owner, balance);
				accountList.add(account);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return accountList;
		
	}
	
	// 예금
	public void deposit() {
	
		System.out.println("=================================================");
		System.out.println("3. 예금");
		System.out.println("=================================================");
			
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
			AccountVO account = findAccount(b);
			
			// DB 연결
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE account SET balance = ? WHERE ano = ?";
			
			// DB account TABLE 정보 수정
			try {
				pstmt = conn.prepareStatement(sql);
				int addMoney = account.getBalance() + money; 
				pstmt.setInt(1, addMoney);
				pstmt.setString(2, account.getAno());
				pstmt.executeUpdate();
				
				System.out.println("정상처리되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn, pstmt);
			}
			
		}else {
			System.out.println("계좌가 없습니다.");
			
		}
		
	}
	
	// 출금
	public void withdraw() {
		
		System.out.println("=================================================");
		System.out.println("4. 출금");
		System.out.println("=================================================");
			
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
				AccountVO account = findAccount(b);
				
				// DB 연결
				conn = JDBCUtil.getConnection();
				String sql = "UPDATE account SET balance = ? WHERE ano = ?";
				
				// DB account TABLE 정보 수정
				try {
					int subMoney = account.getBalance() - money;
					
					if(subMoney < 0) {
						System.out.println("잔액이 부족합니다.");
					}else if(subMoney >= 0) {
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, subMoney);
						pstmt.setString(2, account.getAno());
						pstmt.executeUpdate();
						
						System.out.println("정상처리되었습니다.");
						running = false;
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
			}
			
		}else {
			System.out.println("계좌가 없습니다.");
		}


	}
	
	// 계좌 삭제
	public void deleteAccount() {
		System.out.println("=================================================");
		System.out.println("5. 계좌 삭제");
		System.out.println("=================================================");
		
		System.out.print("계좌번호: ");
		
		String ano = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(ano);
		
		String b = "";
		
		while(matcher.find()) {
			// System.out.println(matcher.group());
			b += matcher.group();
			
		}
		
		if(findAccount(b) != null) {
			AccountVO account = findAccount(b);
			
			// DB 연결
			conn = JDBCUtil.getConnection();
			String sql = "DELETE FROM account WHERE ano = ?";
			
			// DB account TABLE 계좌 삭제
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, account.getAno());
				pstmt.executeUpdate();
				
				System.out.println("정상처리되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn, pstmt);
			}
			
		}else {
			System.out.println("계좌가 없습니다.");
		}
		
	}
	
}
