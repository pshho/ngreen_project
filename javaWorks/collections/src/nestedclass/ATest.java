package nestedclass;

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		
		// B 객체 생성
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		
		// 정적 내부 클랙스 객체 생성
		A.C c = new A.C();
		c.field1 = 4;
		c.method1();
		// c.field2 = 10;
		A.C.field2 = 4;
		// c.method2();
		A.C.method2();
		
		// D 객체 생성
		a.method();
	}

}
