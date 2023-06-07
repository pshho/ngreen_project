package strings;

public class StringIndexOf {

	public static void main(String[] args) {
		// indexOf() - 찾는 문자의 첫번째 위치 반환(return)
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("자바");
		
		System.out.println(location);
		
		if(location != -1) {	// 못찾으면 -1을 반환, location >= 0 조건도 가능
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
		
	}

}
