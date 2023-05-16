package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double RATE_KPH_MPH = 1.609344;
		double mph = 0;
		
		System.out.print("구속을 입력하세요(km/h): ");
		double kph = sc.nextDouble();
		
		mph = kph / RATE_KPH_MPH;
		
		System.out.printf("당신의 구속은 %.2f마일입니다.", mph);
		
		sc.close();
		
	}

}
