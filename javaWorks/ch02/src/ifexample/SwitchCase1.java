package ifexample;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		// switch ~ case 구문(조건의 값이 정해져 있을 때 - if는 주로 값이 범위일 때)
		// 순위에 따른 메달 색상 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수를 입력해주세요: ");
		int rank = sc.nextInt();
		String medalColor = "";
		
		sc.close();
		
		switch (rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronz";
			break;
		default:
			System.out.println("메달이 없습니다.");
			return;
		}
		
		System.out.println("메달 색깔은 " + medalColor + "입니다.");
	}

}
