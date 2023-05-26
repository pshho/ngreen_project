package abstractex.template;

public class CarMain {

	public static void main(String[] args) {
		Car myCar1 = new AiCar();
		Car myCar2 = new HumanCar();
		
		myCar1.run();
		
		System.out.println();
		
		myCar2.run();
	}

}
