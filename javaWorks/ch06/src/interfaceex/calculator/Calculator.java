package interfaceex.calculator;

public interface Calculator {
	// 인터페이스는 컴파일 과정에서 상수로 변환 대문자 변수(final 생략되어 있음)
	int ERROR = -9999;
	
	// 정수형 계산기
	// 거의 추상 메서드
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);

}
