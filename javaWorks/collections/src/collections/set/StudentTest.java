package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		
		//중복 저장 불허하는 자료구조 사용 - Set
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("이순신"));
		set.add(new Student("이순신"));
		set.add(new Student("세종대왕"));
		set.add(new Student("홍길동"));
	
		System.out.println("총 객체수: " + set.size());
		
		//전체 조회
		Iterator<Student> ir = set.iterator();
		while(ir.hasNext()) {
			Student std = ir.next();
			System.out.println(std);
		}
		System.out.println("=========");
		
		//향상 for
		for(Student std : set)
			System.out.println(std);
	}
	
}
