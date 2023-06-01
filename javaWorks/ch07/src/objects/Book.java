package objects;

public class Book {
	
	// field
	int bookNumber;
	String bookTitle;
	
	// 생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// method 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	@Override
	public int hashCode() {
		return bookNumber;	// 해시코드 반환값 기능을 하는 bookNumber
	}

	@Override
	public boolean equals(Object obj) {
		// 강제 형변환
		if(obj instanceof Book) {	// obj가 Book의 객체라면
			Book book = (Book) obj;	// 강제 형변환
			
			if(this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		
		return false;
	}
	
}
