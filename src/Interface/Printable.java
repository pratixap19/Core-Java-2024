package Interface;

public interface Printable {
	//Interface will have only abstract methods.
	
	public static final String name = "Java";
	String address = "US";
	public void print();
	public void testMethod();
	
	//You can create static method with implementation in interface
	public static void test() {
		System.out.println("This is static method of Printable interface");
	}
}
