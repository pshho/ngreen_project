package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		
		// 카드 회사 및 카드 생성
		CardCompany company = CardCompany.getInstance();
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		Card card3 = company.createCard();
		
		for(int i=0; i<card1.getCardSize(); i++) {
			System.out.print(card1.getCard(i+1) + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<card2.getCardSize(); i++) {
			System.out.print(card2.getCard(i+1) + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<card3.getCardSize(); i++) {
			System.out.print(card3.getCard(i+1) + " ");
		}
		
		// System.out.println(card1.getCard(1));
		// System.out.println(card2.getCard(1));
		// System.out.println(card3.getCard(1));
		
	}

}
