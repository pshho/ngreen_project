package fileio.serializationex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		
		// 직렬화
		Person personSon = new Person("손정의", "대표이사");
		Person personJang = new Person("장그래", "부장");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personSon);	// 객체를 파일로 작성
			oos.writeObject(personJang);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// 역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject();	// Object형 -> Person형으로 변환
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
