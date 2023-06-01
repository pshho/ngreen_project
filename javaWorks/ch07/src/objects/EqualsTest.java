package objects;

public class EqualsTest {

	public static void main(String[] args) {
		
		String name1 = new String("오상식");
		String name2 = new String("오상식");
		
		// 객체의 메모리 주소 비교
		System.out.println(name1 == name2);			// false
		
		// 객체의 값을 비교(문자열)
		System.out.println(name1.equals(name2));	// true
		
		// hashCode() 테스트 - 메모리 주소 변환(10진수 출력)
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println("===========================");
		
		Book book1 = new Book(1, "혼공 자바");
		Book book2 = new Book(1, "혼공 자바");
		
		System.out.println(book1 == book2);			// false
		System.out.println(book1.equals(book2));	// false
		
		// book1, book2는 다름 - 재정의 하면 같아짐
		// 생성한 객체의 값이 동일할 때 동일 객체로 인정받으려면 hashCode()와 equals()가 재정의 되어야 함
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
