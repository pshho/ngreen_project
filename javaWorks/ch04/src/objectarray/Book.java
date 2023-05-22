package objectarray;

public class Book {
	
	String bookName;
	String author;
	
	// 기본 생성자
	Book() {};
	
	// 생성자
	Book(String bookName, String author) {
		
		this.bookName = bookName;
		this.author = author;
		
	}
	
	void bookInfo() {
		System.out.println(bookName + " " + author);
	}
	
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	String getBookName() {
		return bookName;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	String getAuthor() {
		return author;
	}

}
