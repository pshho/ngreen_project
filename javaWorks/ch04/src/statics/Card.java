package statics;

public class Card {
	
	static int serialNum = 100;
	private int cardNum;
	
	Card() {
		serialNum++;
		cardNum = serialNum;
	}
	
	// 카드 번호를 가져오는 함수 정의
	int getCard() {
		return cardNum;
	}

}
