package statics;

public class Student {
	
	private static int serialNum = 1000;	// 기준번호
	private int studentId;					// 학번
	private String name;					// 이름
	
	// 기본 생성자
	Student() {
		serialNum++;			// serialNum을 1증가
		studentId = serialNum;	// 증가된 번호를 학번에 대입
	}
	
	// get(), set()
	String getName() {
		return name;
	}
	
	int getStudentId() {
		return studentId;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
