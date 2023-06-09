package fileio;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) throws IOException {

		System.out.print("여러 개의 문자를 입력하고 [Enter]를 누르세요: ");
		
		// 구현 1
//		int readByte;
//
//		while (true) {
//			try {
//				readByte = System.in.read();
//
//				if (readByte == -1) {
//					break;
//				}
//
//				System.out.println((char) readByte);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		// 구현 2
		int data;
		while ((data = System.in.read()) != -1) {	// 읽을 데이터가 있으면
			System.out.print((char) data);		// 데이터 출력
		}

	}

}
