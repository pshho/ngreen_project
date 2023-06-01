package objects;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member("1001");
		Member m2 = new Member("1001");
		Member m3 = new Member("1002");
		
		if(m1.equals(m3)) {
			System.out.println("m1과 m2는 일치합니다.");
		}else {
			System.out.println("m1과 m2는 일치하지 않습니다.");
		}
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());

	}

}
