package exercise;

import java.util.Scanner;
import java.util.regex.*;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = "1111-11-11-1111-1111";
		
		sc.close();
		// String regEx = /[0-9]/g;
		int nLen = num.length();
		
		if(nLen == 16 || nLen == 20) {
			
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(num);
			
			String b = "";
			
			while(matcher.find()) {
				
				// System.out.println(matcher.group());
				b += matcher.group();
				
			}
			
			// System.out.println(b);
			matcher = pattern.matcher(b);
			
			if(matcher.find() == true) {
				
				System.out.println("카드번호가 맞습니다.");
				
			}else {
				
				System.out.println("카드번호가 아닙니다.");
				
			}
			
			
		}else if(nLen == 13 || nLen == 14){
			
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(num);
			
			String b = "";
			
			while(matcher.find()) {
				
				// System.out.println(matcher.group());
				b += matcher.group();
				
			}
			
			int nNum = 0;
			int sumV = 0;
			
			for(int i=0; i<b.length(); i++) {
				
				if(i>7) {
					
					nNum = Integer.parseInt(b.substring(i, i+1)) * (2 + (i - 8));
					sumV += nNum;
					
				}else {
					
					nNum = Integer.parseInt(b.substring(i, i+1)) * (2 + i);
					sumV += nNum;
					
				}
				
			}
			
			int check;
			sumV = sumV / 11;
			check = 11 - sumV;
			
			if(check == Integer.parseInt(b.substring(12, 13))) {
				
				System.out.println("주민등록번호가 맞습니다.");
				
			}else {
				
				System.out.println("주민등록번호가 맞습니다.");
				
			}
			
		}else {
			
			System.out.println("다시 입력해주세요.");
			
		}
		
	}

}
