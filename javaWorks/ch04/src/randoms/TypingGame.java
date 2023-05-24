package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = {
				"물리학적", "복잡성", "양자역학", "체계적", "첨단기술", 
				"포괄적", "복원불가능", "저항력", "유지보수", "대조적"
				};
		String[] str2 = {
				"가", "나", "다", "라", "마",
				"바", "사", "아", "자", "차",
				"카", "타", "파", "하"
		};
		int random = 0;
		double start, end;
		
		start = System.currentTimeMillis();
		// System.out.println(start);
		for(int i=0; i<str.length; i++) {
			/*
			String str3 = "";
			int a = (int)(Math.random() * 5) + 1;
			for(int j=0; j<a; j++) {
				random = (int)(Math.random() * 15);
				str3 += str2[random];
			}
			*/
			random = (int)(Math.random() * 9);
			System.out.printf("문제 %d\n", i+1);
			System.out.println(str[random]);
			System.out.print("입력: ");
			String check = sc.nextLine();
			
			if(check.equals(str[random])) {
				System.out.println("정답!");
			}else {
				System.out.println("다시!");
				i--;
			}
			System.out.println();
		}
		end = System.currentTimeMillis();
		// System.out.println(end);
		
		double time = (end - start) / 1000;
		System.out.printf("걸린 시간은 %.2f초!", time);
		
		sc.close();
		
	}

}
