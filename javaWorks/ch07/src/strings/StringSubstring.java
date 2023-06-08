package strings;

public class StringSubstring {

	public static void main(String[] args) {
		
		// substring(인수1, 인수2) - 인수1에서 시작해서 인수2까지 문자 추출
		String ssn = "940608-2345678";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		// substring(인수1) - 인수1부터 문자 끝까지 추출
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		
		// url 경로 추출
		String url = "/board/boardList.jsp";
		int url_idx = url.lastIndexOf('/');
		String thirdPart = url.substring(url_idx);
		System.out.println(thirdPart);
		
	}

}
