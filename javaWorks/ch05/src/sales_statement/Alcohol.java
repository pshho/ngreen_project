package sales_statement;

public class Alcohol extends Drink {

	protected float alcper; // 알콜 도수

	// 생성자
	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	// 제목 출력
	static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	@Override
	void printData() {
		System.out.println(name + "(" + alcper + "%)\t" + price + "\t" 
				+ count + "\t" + getTotalPrice());
	}

}
