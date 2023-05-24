package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A {
	
	// 상속 관계에서는 protected 제한 허용(다른 패키지라도)
	public D() {
		super();
		this.filed = "good";
		this.method();
		
	}

}
