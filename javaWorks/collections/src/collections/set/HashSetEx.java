package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// Set형으로 객체 생성
		Set<String> set = new HashSet<>();
		
		// crud
		// 객체 추가
		set.add("Java");
		set.add("Jdbc");
		set.add("Servlet/Jsp");
		set.add("Java");
		
		// 삭제
		set.remove("Jdbc");
		
		// 객체수
		System.out.println("총 객체수: " + set.size());
		System.out.println("========================");
		
		// 전체 요소 출력
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String element = ir.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("========================");
		for(String element : set)
			System.out.println(element);
		
		set.clear();

	}

}
