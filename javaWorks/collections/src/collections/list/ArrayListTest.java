package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// 부모형으로 ArrayList 객체 생성
		List<String> vegeList = new ArrayList<>();
		
		// crud(생성, 조회, 수정, 삭제)
		// 자료 생성
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		// 개체 수
		System.out.println(vegeList.size() + "개");
		
		// 1개 검색
		String str = vegeList.get(1);
		System.out.println(str);
		System.out.println("============================");
		
		// 1개 수정
		vegeList.set(1, "고추");
		
		// 삭제
		vegeList.remove("감자");
		
		// 전체 검색
		for(int i=0; i<vegeList.size(); i++) {
			System.out.println(vegeList.get(i));
		}
		
		// 향상 for문
		for(String vege : vegeList)
			System.out.println(vege);

	}

}
