package abstractex.animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.breathe();
		// cat.sound();
		animalSound(cat);
		cat.showInfo();
		
		System.out.println();
		
		dog.breathe();
		// dog.sound();
		animalSound(dog);
		dog.showInfo();
		
	}
	
	// 매개 변수의 다형성
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
