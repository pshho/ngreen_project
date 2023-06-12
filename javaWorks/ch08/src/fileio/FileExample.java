package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("c:/file/newFile.txt");
		file.createNewFile();
		
		// System.out.println("파일 생성");
		
		System.out.println(file.isFile());				// 파일인지 여부
		System.out.println(file.isDirectory());			// 디렉터리 여부
		System.out.println(file.getName());				// 파일 이름
		System.out.println(file.getPath());				// 파일 경로(위치)
		System.out.println(file.length() + "Byte");		// 파일 용량
		
	}

}
