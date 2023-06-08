package systems;

public class SystemNanoTime {

	public static void main(String[] args) {
		
		double start, end;
		
		start = System.nanoTime();
		long sum = 0L;
		
		for(long i=1L; i<1_000_000_000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		
		System.out.println(sum);
		System.out.printf("걸린 시간: %f\n", (end-start)/1_000_000_000);
		
	}

}
