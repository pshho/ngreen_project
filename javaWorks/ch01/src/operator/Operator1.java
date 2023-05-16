package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 영어, 수학 과목의 총점과 평균
		int engScore = 90;
		int mathScore = 85;
		int totalScore;
		double avgScore;	// 실수형 8byte 자료형
		
		// 총점과 평균 계산
		totalScore = engScore + mathScore;
		avgScore = (double)totalScore / 2;	// int로 연산하면 int형으로만 나옴(자료의 손실)
		
		// 출력
		System.out.println("총점: " + totalScore); // 숫자형이 문자형으로 자동 형변환
		System.out.println("평균: " + avgScore);
		
		// ++ 연산자 - 1증가, -- 연산자 - 1감소
		// ++가 뒤에 사용 - 후치연산, 앞에 사용 - 전치연산
		int num = 10;
		int val = 0;
		
		// val = num++;	// 계산순서 1. val에 num의 10을 넣고 2. num 10에 1을 증가시킴
		val = ++num;	// 계산순서 1. num 10에 1을 증가시키고 2. val에 num 11을 넣음
		
		System.out.println(val);
		System.out.println(num);
	}

}
