package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만: 취학 전 아동(1000원), 14세 미만: 초등학생(2000원), 20세 미만: 중, 고등학생(2500원), 그 외 일반인(3000원)
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("몇 세입니까? ");
			int age = sc.nextInt();
		
		int fee;
		
		if (age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if (age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
		}else if (age < 20) {
			fee = 2500;
			System.out.println("중, 고등학생입니다.");
		}else {
			fee = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.printf("입장료는 %d원 입니다.", fee);
		
		sc.close();
		
		}catch (Exception e) {
			System.out.println("나이를 정확히 입력해주세요.");
		}
	}

}
