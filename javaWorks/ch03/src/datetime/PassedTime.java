package datetime;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar theDay = Calendar.getInstance();
		
		// System.out.println(today);
		// System.out.println(today.get(Calendar.YEAR));
		// System.out.println(today.get(Calendar.MONTH) + 1);
		// System.out.println(today.getTimeInMillis());
		
		// 년으로 환산
		// System.out.println(today.getTimeInMillis() / (24*60*60*1000)/365);
		// 일로 환산
		// System.out.println(today.getTimeInMillis() / (24*60*60*1000));
		
		// 시작일과 종료일 지정
		theDay.set(2023, 3, 16);	// 시작일
		today.set(2023, 5, 24);		// 시작일
		
		// 날짜 출력 메소드
		System.out.println(datePrint(theDay));
		System.out.println(datePrint(today));
		
		// 날짜 출력
		String startDay = theDay.get(Calendar.YEAR) + "년 "
				+ theDay.get(Calendar.MONTH) + "월 " + theDay.get(Calendar.DATE) + "일";
		String endDay = today.get(Calendar.YEAR) + "년 "
				+ today.get(Calendar.MONTH) + "월 " + today.get(Calendar.DATE) + "일";
		// System.out.println(startDay);
		// System.out.println(endDay);
		
		// 지나온 시간 계산
		long passedTime = (today.getTimeInMillis() - theDay.getTimeInMillis());
		// System.out.println(passedTime);
		
		// 일로 환산
		long passedDay = passedTime / (24*60*60*1000);
		System.out.println("개강 이후 " + passedDay + "일이 지났습니다.");
		
	}
	
	public static String datePrint(Calendar date) {	// 날짜 객체를 매개로 전달받음
		
		String day = date.get(Calendar.YEAR) + "년 "
				+ date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
		
		return day;
		
	}

}
