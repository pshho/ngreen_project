package statics;

public class CardTest {

	public static void main(String[] args) {
		
		// 카드 번호 101, 102, 103번 생성
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println("카드번호: " + card1.getCard());
		System.out.println("카드번호: " + card2.getCard());
		System.out.println("카드번호: " + card3.getCard());
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		
	}

}