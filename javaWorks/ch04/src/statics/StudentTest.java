package statics;

public class StudentTest {

	public static void main(String[] args) {
		
		// 학생 객체 생성(lee - heap 영역에 저장)		
		Student lee = new Student();
		// lee.studentId = 1001;
		// lee.name = "이대한";
		
		
		// lee.name = "이대한";
		lee.getName();
		lee.setName("이대한");
		lee.setStudentId(1001);
		
		System.out.printf("학번: %d, 이름: %s", 
				lee.getStudentId(), lee.getName());
		
	}

}
