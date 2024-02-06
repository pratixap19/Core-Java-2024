package JavaBasicConcepts;
//followed Naveen Automation
public class LocalVsGlobalVariables {
	
	//global/class variables
	String name = "Tom";
	int age = 25;
	
	public void sum() {
		int i=10;//local variable for sum()
		int j = 10;
		int k = i+j;
		System.out.println(k);
	}

	public static void main(String[] args) {
		
	int i = 10;//local variable for main method
	System.out.println(i);
	
	LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
	System.out.println(obj.name);
	System.out.println(obj.age);
	obj.sum();
	
	}

}
