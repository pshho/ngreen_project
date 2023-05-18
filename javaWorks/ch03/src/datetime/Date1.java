package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// 날짜와 시간 객체 생성
		Date now = new Date();
		
		System.out.println(now);
		
		// 날짜와 시간 형식(년-월-일 시:분:초) - 월은 MM, 시간은 대문자인 경우 24시간제, 소문자인 경우 12시간제
		SimpleDateFormat datetime1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		String today1 = datetime1.format(now);
		
		System.out.println(today1);
		
		// 날짜
		SimpleDateFormat datetime2 = new SimpleDateFormat("yyyy-MM-dd");
		String today2 = datetime2.format(now);
		
		System.out.println(today2);
		
		// 시간
		SimpleDateFormat datetime3 = new SimpleDateFormat("HH-mm-ss a");
		String today3 = datetime3.format(now);
		
		System.out.println(today3);
	}

}
