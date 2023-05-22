package exercise;

import java.util.Scanner;

public class Request1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int fee = 0;
			
			try {
				System.out.print("나이를 입력해주세요: ");
				String age = sc.nextLine();
				
				if(Integer.parseInt(age) < 8 && Integer.parseInt(age) >= 0) {
					fee = 1500;
					System.out.println("아동입니다.");
				}else if(Integer.parseInt(age) >= 8 && Integer.parseInt(age) < 14) {
					fee = 2000;
					System.out.println("초등학생입니다.");
				}else if(Integer.parseInt(age) >= 14 && Integer.parseInt(age) < 19) {
					fee = 2500;
					System.out.println("중, 고등학생입니다.");
				}else if(Integer.parseInt(age) >= 19 && Integer.parseInt(age) <= 100) {
					fee = 3000;
					System.out.println("일반인 입니다.");
				}else {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				System.out.printf("입장료는 %d원 입니다.", fee);
				
			}catch(NumberFormatException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println();
			System.out.print("다시 하려면 Y(y) 아니면 N(n): ");
			String text = sc.nextLine();
			
			if(text.equalsIgnoreCase("Y")) {
				continue;
			}else if(text.equalsIgnoreCase("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
		}
		
	}

}
