package Polymorphism;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int x) {
		System.out.println(x);
	}
	
	public ConstructorOverloading(double x) {
		System.out.println(x);
	}
	
	public ConstructorOverloading(double x, double y) {
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading (5);
		ConstructorOverloading obj1 = new ConstructorOverloading (2.5);
		ConstructorOverloading obj2 = new ConstructorOverloading (3.5, 4.5);

	}

}
