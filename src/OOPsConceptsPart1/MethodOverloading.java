package OOPsConceptsPart1;
//followed Naveen Automation
//methods available in the same class with same names with different parameters is called method overloading.
//you can't create a method inside a method
//duplicate methods - same method name with same parameters are not allowed
//main method can be overloaded
//advantage - memory saving, increase readability of the program
public class MethodOverloading {
	
	public void sum() {//zero input paramater
		System.out.println("zero parameter");
	}
	
	public void sum(int i) {//one input parameter
		System.out.println("one input parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int l) {
		System.out.println("two input parameters");
		System.out.println(k+l);
	}
	
	public void sum(int j, int a, int b) {//three input parameter
		System.out.println("three input parameter");
		System.out.println(j+a+b);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		obj.sum(5,7,8);
	}

}
