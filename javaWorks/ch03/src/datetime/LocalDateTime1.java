package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {
		// LocalDate - 날짜, LocalTime - 시간, LocalDateTime - 날짜와 시간
		// 날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 날짜
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 시간
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// 날짜와 시간 형식 - DateTimeFormatter
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		String currentTime = now.format(dateTime);
		System.out.println(currentTime);
		
	}

}