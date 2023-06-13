package fileio.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {

		// 이미지 파일 읽고 쓰기(복사)
		String originFile = "c:/file/ojdbc8.jar";	// 원본 파일
		String copyFile = "c:/file/ojdbc8_1.jar";	// 사본 파일
		
		long start = System.nanoTime();
		// 보조 스트림 - BufferedStream 사용해서 시간을 단축시킴
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data;
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		double time = (double)(end - start) / 1000000000;
		
		System.out.println("복사 완료");
		System.out.println("걸린 시간: " + time + "초");

	}

}
