package Inheritance;
//followed CodeStudio video
class M {
	
	int a;
	public void display() {
		System.out.println("Class M: " + a);
	}
}

class N extends M {
	
	int b;
	public void print() {
		System.out.println("Class N: " + b);
	}
}

class P extends N{
	int c;
	public void printC() {
		System.out.println("Class P:" + c);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		P objp = new P();
		objp.a=10;
		objp.b=20;
		objp.c=30;
		
		objp.display();
		objp.print();
		objp.printC();
		
	}

}
