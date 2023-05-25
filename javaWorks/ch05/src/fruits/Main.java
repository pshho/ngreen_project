package fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 포도 | 2. 바나나 | 3. 복숭아");
		System.out.print("선택> ");
		
		int menu = Integer.parseInt(scan.nextLine());
		
		Fruit fruit = null;
		
		if(menu == 1) {
			 fruit = new Grape();
			// grape.showInfo();
		}else if(menu == 2) {
			fruit = new Banana();
			// banana.showInfo();
		}else if(menu == 3) {
			fruit = new Peach();
			// peach.showInfo();
		}
		fruit.showInfo();
		
		scan.close();
	}

}
