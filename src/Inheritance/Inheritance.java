package Inheritance;

class A {

	int a;

	void display() {
		System.out.println("Class A :" + a);
	}
}

class B extends A {

	int b;

	void print() {
		System.out.println("Class B :" + b);
	}
}

class C extends B {

	int c;

	void printC() {
		System.out.println("Class C :" + c);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		A objA = new A();
		objA.a = 20;
		objA.display();

		B objB = new B();
		objB.a = 45;
		objB.b = 50;

		objB.display();
		objB.print();

		C objC = new C();
		objC.a = 100;
		objC.b = 200;
		objC.c = 300;

		objC.display();
		objC.print();
		objC.printC();
	}

}
