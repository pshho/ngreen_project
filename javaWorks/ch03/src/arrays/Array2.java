package arrays;

public class Array2 {

	public static void main(String[] args) {
		// 문자열 형 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// "Sonata"를 검색하시오
		System.out.println(cars[1]);
		
		// "K7"을 "BMW"로 변경
		cars[3] = "BMW";
		
		// 전체출력
		for (int j=0; j<cars.length; j++) {
			System.out.print(cars[j] + " ");
		}
		
		System.out.println();
		
		// 향상된 for구문
		// for (자료형 변수 : 배열이름) {}
		for (String car : cars) {
			System.out.print(car + " ");
		}
	}

}
