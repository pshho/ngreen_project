package nestedclass;

public class A {
	A() {
		System.out.println("A 객체 생성");
	}
	
	class B {
		int field1;
		
		B() {
			System.out.println("B 객체 생성");
		}
		
		void method1() {}
	}
	
	static class C {
		C() {System.out.println("C 객체 생성");}
		int field1;
		static int field2;
		
		void method1() {};
		static void method2() {}
	}
	
	// local 클래스(method 내부 존재)
	void method() {
		class D {
			D() {System.out.println("D 객체 생성");}
			int field1;
			// static final int field2 = 10;
			void method1() {}
		}
		D d = new D();
		d.field1 = 1;
		d.method1();
	}
}
