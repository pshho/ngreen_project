package methods;

public class Random1 {

	public static void main(String[] args) {
		// Math.random() 사용
		// 주사위 10번 던지기
		for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6+1);
			// System.out.println(dice);
		}
		
		// 문자를 난수(무작위)로 추출하기
		String[] word = {"나", "너", "우리", "세계"};
		int rnd = (int)(Math.random()*4);
		
		System.out.println(rnd);
		System.out.println(word[rnd]);
		
		// 로또 복권 추첨
		// 번호 6개 저장할 배열 선언
		int[] lotto = new int[6];
		
		// 로또 번호 저장
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			// 중복 문제 발생
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {	// 이전 번호와 일치하면
					i--;	// 이전 인덱스로 이동
				}
			}
		}
		
		for(int a=0; a<lotto.length; a++) {
			System.out.print(lotto[a] + " ");
		}
		
	}

}
