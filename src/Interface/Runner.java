package Interface;

public class Runner {

	public static void main(String[] args) {

		Book b = new Book();
		b.print();
		b.testMethod();
		b.m1();
		System.out.println(Printable.name);
		System.out.println(Printable.address);
		
		Printable p = new Book();
		p.print();
		
		Printable.test();
	}

}
