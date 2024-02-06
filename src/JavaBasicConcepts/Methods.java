package JavaBasicConcepts;
//followed Naveen Automation
public class Methods {

	//non static methods
	
	//return type is void
	public void test() {//no input no output
		System.out.println("Test method");
	}
	
	public int sum() {//no input some output
		int a = 10;
		int b = 23;
		int c= a+b;
		System.out.println("sum is :" + c);
		return c;
	}
	
	public String qa() {////no input some output
		System.out.println("qa methods");
		String s="Selenium";
		System.out.println(s);
		return s;
		
	}
	
	public int devision(int x, int y) {//input parameters/arguments
		System.out.println("Devision methods");
		int d = x/y;
		System.out.println("devision is:" + d);
		return d;
	}
	
	
	public static void main(String[] args) {
		Methods mc = new Methods();
		mc.test();
		mc.sum();
		mc.qa();
		mc.devision(20, 5);
	}

}
