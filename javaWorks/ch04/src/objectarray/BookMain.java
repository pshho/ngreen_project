package objectarray;

public class BookMain {

	public static void main(String[] args) {
		
		// Book 객체 생성 - 책 5권
		Book[] library = new Book[5];
		
		/**
		 * // 배열의 초기값 - null
		 * for(int i=0; i<library.length; i++) {
		 * 		System.out.println(library[i]);
		 * }
		*/
		
		// 자료 저장
		library[0] = new Book("반응형 웹사이트", "김은아");
		library[1] = new Book("Tiny Python Project", "켄 유엔스-클릭");
		library[2] = new Book("혼자 공부하는 자바", "신용권");
		// library[3] = new Book("미생1", "윤태호");
		// library[4] = new Book("미생2", "윤태호");
		
		for(int i=0; i<library.length; i++) {
			
			if(library[i] != null) {
				library[i].bookInfo();
			}

		}
		
		System.out.println();
		
		// 향상된 for
		for(Book book : library) {
			if(book != null) {
				book.bookInfo();
			}
		}

	}

}
