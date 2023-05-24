package singleton.card;

import java.util.ArrayList;

public class Card {
	
	private static int serialNum = 100;
	private String cardNum;
	private ArrayList<String> cardSeries = new ArrayList<>();
	private String modelName = "K3";
	
	Card() {
		serialNum++;
		cardNum = "" + serialNum;
		cardSeries.add(cardNum);
		cardSeries.add(modelName);
	}
	
	// 카드 번호를 가져오는 함수 정의
	public String getCard(int i) {
		if(i>=1 && i<=cardSeries.size()) {
			return cardSeries.get(i-1);
		}else {
			return "유효하지 않은 번호입니다.";
		}
		
	}
	
	public int getCardSize() {
		return cardSeries.size();
	}

}
