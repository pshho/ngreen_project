package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// 구현 클래스인 MyClass의 객체 생성
		MyClass mc = new MyClass();
		
		// 부모형으로 객체 할당(자동 형변환)
		X x = mc;
		Y y = mc;
		
		x.x();
		y.y();
		
		System.out.println("======================");
		
		// MyInterface 형으로 객체 생성 - 다중 상속 구현
		MyInterface mi = mc;
		
		mi.x();
		mi.y();
		mi.myMethod();
		
	}

}
