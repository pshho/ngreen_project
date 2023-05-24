package protectedex.pack1;

public class B {
	
	public void mehtod() {
		
		// protected는 같은 패키지 안에서 접근 제한자 허용
		A a = new A();
		a.filed = "good";
		a.method();
		
	}

}
