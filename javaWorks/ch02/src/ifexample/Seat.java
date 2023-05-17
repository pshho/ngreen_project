package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int customer;	// 입장객 수
		int colNum;		// 좌석 열 수
		int rowNum;		// 좌석 줄(행) 수
		
		System.out.print("입장객 수 입력: ");
		customer = sc.nextInt();
		System.out.print("열 수 입력: ");
		colNum = sc.nextInt();
		
		// 연산 처리(조건문) - 나누어 떨어지는 경우, 줄(행)수에 1을 더하는 경우
		if (customer % colNum == 0) {
			rowNum = customer / colNum;
		}else {
			rowNum = (customer / colNum) + 1;
		}
		
		for (int i=0; i<rowNum; i++) {
			for (int j=1; j<=colNum; j++) {
				int num = colNum * i + j;
				if (num <= customer) {
					System.out.print(num + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
