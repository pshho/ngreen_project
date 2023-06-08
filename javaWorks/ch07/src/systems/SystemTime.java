package systems;

public class SystemTime {

	public static void main(String[] args) {
		
		// 수행 시간 측정
		long start, end, start2, end2;
		start = System.currentTimeMillis();	// ms(1/1000)초로 계산
		start2 = System.nanoTime();
		System.out.println(start / 1000);	// 시작 시간 출력
		
		long sum = 0;
		
		for(int i=1; i<100000000; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();	// 종료 시간 출력
		end2 = System.nanoTime();
		System.out.println(end / 1000);
		
		System.out.println(sum);
		System.out.printf("계산에 소요된 시간: %f초\n", (double)(end-start)/1000);
		System.out.printf("계산에 소요된 시간: %f초\n", (double)(end2-start2)/1000000000);
		
	}

}
