package AccessModifiers;

public class ClassB {
	
	public static void main(String[] args) {
		ClassA c = new ClassA(5);
		int i = c.id;
		System.out.println(i);
		c.printId();
		
	}
}
