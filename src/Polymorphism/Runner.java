package Polymorphism;

public class Runner {

	public static void main(String[] args) {
//		MethodOverloadingDemo mod = new MethodOverloadingDemo();
//		mod.add(6, 10);
		
		Animal a = new Animal();
		a.printAnimal();
		
		Dog d = new Dog();
		d.printAnimal();
		
		Animal a1 = new Dog();
		a1.printAnimal();
	}

}
