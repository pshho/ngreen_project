package beans;

// 계산기 자료형 (VO + DAO)
public class Calculator {
	
	// field
	private int x, y, result;
	private String op = "";	// 연산자
	
	// 계산하기 메서드
	public int Calculate() {
		if(op.equals("+")) {
			result = x + y;
		}else if(op.equals("-")) {
			result = x - y;
		}else if(op.equals("x")) {
			result = x * y;
		}else if(op.equals("/")) {
			result = x / y;
		}
		return result;
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getOp() {
		return op;
	}


	public void setOp(String op) {
		this.op = op;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}
	
	
}
