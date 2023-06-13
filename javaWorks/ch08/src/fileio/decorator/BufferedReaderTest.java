package fileio.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		// 문자열 읽어오기 - 보조 스트림 사용
		// 보조 스트림의 클래스의 생성자로 기반 스트림 객체 사용
		try(FileReader fr = new FileReader("msg.txt");
			BufferedReader br = new BufferedReader(fr)) {
			String line = null;
			
			while(true) {
				line = br.readLine();	// 한 줄로 읽은 데이터 저장
				if(line == null) break;	// 읽을 데이터 없으면 break
				System.out.println(line);
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
