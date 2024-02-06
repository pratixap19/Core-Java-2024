package Encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setName("John");
		String nm = emp.getName();
		System.out.println(nm);

	}

}
