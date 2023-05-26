package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성 안됨
		// Calculator calc = new Calculator();
		
		// MyCalculator로 객체 생성
		MyCalculator calc = new MyCalculator();
		
		int x = 10, y = 0;
		
		int add = calc.add(x, y);
		int sub = calc.subtract(x, y);
		int tim = calc.times(x, y);
		int div = calc.divide(x, y);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(tim);
		System.out.println(div);
	}

}
