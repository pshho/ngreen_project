package enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		Week today = null;	// 객체 자료형(배열, String) null로 초기화
		
		Calendar cal = Calendar.getInstance();
		
		// System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(day);
		// 1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토
		switch(day) {
		case 1:
			today = Week.일요일; break;
		case 2:
			today = Week.월요일; break;
		case 3:
			today = Week.화요일; break;
		case 4:
			today = Week.수요일; break;
		case 5:
			today = Week.목요일; break;
		case 6:
			today = Week.금요일; break;
		case 7:
			today = Week.토요일; break;
			
		}
		// System.out.println("Today is " + today);
		System.out.println("오늘은 " + today + "입니다.");
		
		if(today == Week.일요일) {
			System.out.println("일요일에는 영화보러 갑니다.");
		}else {
			System.out.println("열심히 프로그램 코딩합니다.");
		}
		
	}

}
