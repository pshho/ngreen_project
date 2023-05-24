package singleton;

public class Company {
	
	// 싱글톤 패턴으로 작성
	// 유일하게 생성한 인스턴스(싱글톤 - Company 클래스 객체)
	private static Company instance;	// 필드, 객체 변수
	
	// 기본 생성자
	private Company() {}
	
	// instance에 접근(사용)할 메소드
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
			
		return instance;
		
	}

}
