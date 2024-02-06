package OOPsConceptsPart1;

public class ConstructorWithThisKeyword {

	//class variable
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println(name);
		//System.out.println(age);
		
	}
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword ck = new ConstructorWithThisKeyword("Tom", 23);
		System.out.println(ck.name);
		System.out.println(ck.age);
	}

}
