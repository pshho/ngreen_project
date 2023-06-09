package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("data.txt");
		
		fw.write("Hello~\n");
		fw.write("안녕!\n");
		fw.write(66);	// 정수는 아스키 코드값으로 인식
		fw.write(10);
		fw.write(66 + 1);
		fw.write(10);
		// fw.write(1.25);	// 실수 사용 X
		char[] buf = {'s', 'm', 'i', 'l', 'e'};
		
		fw.write(buf);
		fw.write(10);	// 줄바꿈(아스키 코드로 개행문자)
		fw.write(buf, 1, 4);	// 1번 인덱스부터 4번 인덱스까지 출력
		
		fw.close();
		
		System.out.println("수행 완료!");
		
	}

}
