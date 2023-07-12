package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// Vector - 멀티 스레드 환경에서 사용
		List<String> vegeList = new Vector<>();
		
		// 객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		// 특정 위치에 추가
		vegeList.add(2, "고추");
		
		// 수정
		vegeList.set(3, "상추");
		
		// 삭제
		vegeList.remove("마늘");
		
		// 전체 조회
		for(int i=0; i<vegeList.size(); i++) {
			System.out.println(vegeList.get(i));
		}
		
		System.out.println("=============================");
		
		for(String vege : vegeList)
			System.out.println(vege);

	}

}
