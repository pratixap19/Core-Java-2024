package OOPsConceptsPart1;
//followed Naveen Automation
//constructor can be overloaded as below
//constructor will be called when object is created
public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	
	public ConstructorOverloading(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("The value of i is : " + i);
	}
	
	public ConstructorOverloading(int i, int j) {
		System.out.println("Two parameter constructor");
		System.out.println("The value of i is : " + i);
		System.out.println("The value of j is : " + j);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading cc = new ConstructorOverloading();
		ConstructorOverloading cc1 = new ConstructorOverloading(10);
		ConstructorOverloading cc2 = new ConstructorOverloading(10,20);
	}

}
