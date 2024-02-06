package Inheritance;
//followed CodeStudio video
class Parent{
	int a;
	public void display() {
		System.out.println("Class parent:" + a);
	}
}

class Child1 extends Parent{
	int b;
	public void displayChild1() {
		System.out.println("Class child1:" + b);
	}
}

class Child2 extends Parent{
	int c;
	public void DisplayChild2() {
		System.out.println("Class child2:" + c);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 obj1 = new Child1();
		obj1.a=100;
		obj1.b=200;
		obj1.display();
		obj1.displayChild1();
		
		Child2 obj2 = new Child2();
		obj2.a=300;
		obj2.c=400;
		obj2.display();
		obj2.DisplayChild2();
		
		
	}

}
