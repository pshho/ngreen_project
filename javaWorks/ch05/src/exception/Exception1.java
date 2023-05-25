package exception;

public class Exception1 {

	public static void main(String[] args) {
		// NullPointerException 발생하는 예외
		String data = null;
		
		// toString() - data의 정보를 문자열로 출력하는 메서드
		// runtime error - 실행 예외
		// data.toString();
		
		// NumberFormatException - 숫자 형식이 아닐 때 발생하는 예외
		String data2 = "a200";
		int value = Integer.parseInt(data2);
		System.out.println(value);

	}

}
