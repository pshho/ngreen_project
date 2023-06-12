package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {

	public static void main(String[] args) {
		
		Reader fr = null;
		
		try {
			fr = new FileReader("data.txt");
			
			int data;
			
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
