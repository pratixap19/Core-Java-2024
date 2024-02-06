package Interface;

public class Book implements Printable, Interface2 {

	@Override
	public void print() {
		System.out.println("This is print method");
	}

	@Override
	public void testMethod() {
		System.out.println("This is test method");
	}

	@Override
	public void m1() {
		System.out.println("This is interface 2 method");
		
	}

}
