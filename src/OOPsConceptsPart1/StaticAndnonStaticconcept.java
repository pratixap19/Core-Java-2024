package OOPsConceptsPart1;
//followed Naveen Automation
public class StaticAndnonStaticconcept {

	String name = "Tom"; //non static global veriable
	static int age = 25; //static global veriable
	
	//how to call static methods and variables?
	//1. direct calling
	//2. calling by class name
	
	//how to call non static methods and variables
	//by creating object
	
	
	public void sendMail() {
		System.out.println("Send mail method");
	}
	
	public static  void sum() {
		System.out.println("sum method");
	}
	public static void main(String[] args) {
		
		StaticAndnonStaticconcept.sum();
		System.out.println(StaticAndnonStaticconcept.age);
		System.out.println(age);
		sum();
		
		StaticAndnonStaticconcept obj = new StaticAndnonStaticconcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		//can I access static methods by using object reference? -yes but it is not a good practice
		obj.sum();
		
		
	}

}
