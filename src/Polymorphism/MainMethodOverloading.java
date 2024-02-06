package Polymorphism;

public class MainMethodOverloading {

	void main(int x) {
		System.out.println(x);
	}

	void main(double x) {
		System.out.println(x);
	}

	void main(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main(3);
		obj.main(2.4);
		obj.main(4, 6);
	}

}
