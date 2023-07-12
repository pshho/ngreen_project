package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// 중복 저장 불허 자료 구조 사용 - set
		Set<Student> set = new HashSet<>();
		Student lee = new Student("이순신", 20);
		Student lee2 = new Student("이순신", 20);
		Student se = new Student("세종대왕", 20);
		
		set.add(lee);
		set.add(lee2);
		set.add(se);
		
		System.out.println("총 객체수: " + set.size());
		
		// 전체 조회
		Iterator<Student> ir = set.iterator();
		
		while(ir.hasNext()) {
			Student std = ir.next();
			System.out.println(std);
		}
		
		// 향상 for
		for(Student std : set)
			System.out.println(std);
		
	}

}
