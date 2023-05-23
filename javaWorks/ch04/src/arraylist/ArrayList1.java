package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// 기본적으로 10개의 공간이 생김
		ArrayList<String> cartList = new ArrayList<>();
		
		// 자료 저장 - add()함수
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("김밥");
		cartList.add("간장");
		cartList.add("두부");
		
		// 특정 1개 요소 가져오기(검색)
		// System.out.println(cartList.get(0));
		// System.out.println(cartList.get(1));
		
		// cartList의 크기 - size() 함수
		// System.out.println(cartList.size() + "개");
		
		// 전체 요소 출력
		for(int i=0; i<cartList.size(); i++) {
			
			System.out.println(cartList.get(i));
			
		}
		
		System.out.println();
		
		// 요소 수정 - set()
		cartList.set(0, "라면");
		
		// 요소 삭제 - remove()
		// cartList.remove(1);
		// cartList.remove("콩나물");
		// contains() - 객체를 포함하는지 확인, 인덱스가 없으면 예외 발생(사용 권장)
		if(cartList.contains(cartList.get(3))) {
			
			cartList.remove(3);
			
		}
			
		
		// 향상된 for문
		for(String cart : cartList) {
			
			System.out.println(cart);
			
		}
		
	}

}
