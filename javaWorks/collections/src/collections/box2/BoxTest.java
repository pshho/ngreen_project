package collections.box2;

public class BoxTest {

	public static void main(String[] args) {
		// 문자형 사용
		Box box1 = new Box();
		box1.set("행운을 빌어요!");
		String msg = (String)box1.get();
		System.out.println(msg);

	}

}
