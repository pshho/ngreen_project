package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Map 객체 생성 - 학생의 이름과 성적을 관리(crud)
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 생성(저장)
		map.put("이순신", 90);
		map.put("홍길동", 80);
		map.put("강감찬", 75);
		map.put("홍길동", 60);	// key는 중복 불허, 값은 변경 가능
		
		System.out.println(map.size());
		
		// 객체 1개 조회(점수) - get()
		System.out.println(map.get("강감찬"));
		System.out.println(map.get("홍길동"));
		
		// 객체 삭제 - key로 삭제
		if(map.containsKey("이순신")) {	// key가 존재하는지 확인(true/false)
			map.remove("이순신");			
		}
		
		// "강감찬"의 점수를 100점으로 변경
		map.put("강감찬", 100);
		
		// 전체 목록 조회 - Set, Iterator 자료형 사용
		// Set<String> keySet = map.keySet();	// 중복이 안되도록 자료 Set으로 저장
		// Iterator<String> ir = keySet.iterator();	// 1개씩 순회
		Iterator<String> ir = map.keySet().iterator();	// 1개씩 순회
		
		
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + " " + value);
		}
	}

}
