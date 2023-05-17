package ifexample;

import java.util.Scanner;

public class IfOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자를 입력해주세요: ");
			int x = sc.nextInt();
			System.out.print("숫자를 입력해주세요: ");
			int y = sc.nextInt();
			int result = 0;
			double result2 = 0;
			
			sc.nextLine();
			System.out.print("사칙연산을 입력해주세요(+, -, *, /): ");
			String operator = sc.nextLine();
			
			sc.close();
			
			if (operator.equals("+")) {
				result = x + y;
			}else if (operator.equals("-")) {
				result = x - y;
			}else if (operator.equals("*")) {
				result = x * y;
			}else if (operator.equals("/")) {
				result2 = (double)x / y;
				System.out.println("x" + operator + "y=" + result2);
				return;
			}else {
				System.out.println("지원하지 않는 기능입니다.");
				return;
			}
			
			System.out.println("x" + operator + "y=" + result);
		}catch (Exception e) {
			System.out.println("숫자와 사칙연산 기호를 정확히 입력해주세요.");
		}
	}

}
