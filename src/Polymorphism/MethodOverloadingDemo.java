package Polymorphism;

public class MethodOverloadingDemo {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.add(3, 7);
		mod.add(3, 4, 5);
		mod.add(3, 4, 5, 6);
	}

}
