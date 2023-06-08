package systems;

public class SystemExit {

	public static void main(String[] args) {
		
		// System.exit(0) - 0은 정상 종료를 의미
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i == 5) {
				// break;			// for문 종료
				// System.exit(0);	// JVM 자체 종료
				return;
			}
			
		}
		System.out.println("반복 종료");
		
	}

}
