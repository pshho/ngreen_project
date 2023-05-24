package inheritance.person;

// Person 클래스 상속
public class Engineer extends Person {
	
	// field
	int companyId;
	
	public static void main(String[] args) {
		
		Engineer eng = new Engineer();
		
		eng.name = "봉구";		// 부모 필드 상속
		eng.age = 27;			// 부모 필드 상속
		eng.companyId = 256;
		
	}

}
