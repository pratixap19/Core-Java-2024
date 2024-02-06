package Inheritance;
//followed CodeStudio video
class X {
	
	int a;
	public void display() {
		System.out.println("Class X: " + a);
	}
}

class Y extends X {
	
	int b;
	public void print() {
		System.out.println("Class Y: " + b);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		X objx = new X();
		objx.a = 20;
		objx.display();

		Y objy = new Y();
		objy.a = 45;
		objy.b = 50;
		
		objy.display();
		objy.print();

	}

}
