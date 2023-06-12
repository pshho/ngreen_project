package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {
	
	public static void main(String[] args) {
		
		// 이미지 파일 읽고 쓰기(복사)
		String originFile = "c:/file/cat.jpg";	// 원본 파일
		String copyFile = "c:/file/cat1.jpg";	// 사본 파일
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			
			int i;
			
			while((i = fis.read()) != -1) {	// 이미지 파일 읽고
				fos.write(i);				// 쓰기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("복사 완료");
	
	}
}
