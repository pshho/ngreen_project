package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
	
	public static void main(String[] args) {
		
		// 이미지 파일 읽고 쓰기(복사)
		String originFile = "c:/file/cat.jpg";	// 원본 파일
		String copyFile = "c:/file/cat2.jpg";	// 사본 파일
		
		long start = System.nanoTime();
		// try ~ with ~ resource
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)) {
			
			int i;
			
			while((i = fis.read()) != -1) {	// 이미지 파일 읽고
				fos.write(i);				// 쓰기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		
		double time = (double)(end - start) / 1000000000;
		
		System.out.println("복사 완료");
		System.out.println("걸린 시간: " + time + "초");
	
	}
}
