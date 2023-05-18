package arrays;

public class ArrayCalc {

	public static void main(String[] args) {
		// 배열의 총점과 평균
		// 90, 70, 85, 60
		int[] score = new int[4];
		score[0] = 80;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;		
		
		int total = 0;
		
		// 총점 계산
		for (int i=0; i<score.length; i++) {
			total += score[i];
		}
		
		// 출력
		System.out.println("합계: " + total);
		
		// 평균
		double avg = (double)total / score.length;
		
		// 출력
		System.out.println("평균: " + avg);
		
		// 최고 점수
		int maxV = score[0];	// 첫번째 값 최고 점수로 설정
		
		for(int i=0; i<score.length; i++) {
			if(maxV < score[i]) {	// 최대값이 다음 정수보다 작으면 다음 정수로 최대값 설정
				maxV = score[i];
			}
		}
		
		System.out.println("최고 점수: " + maxV);
		
	}

}
