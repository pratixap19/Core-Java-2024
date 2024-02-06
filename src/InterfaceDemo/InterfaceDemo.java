package InterfaceDemo;

interface showDetails {
	int a = 0;// variables are by default static and final
	public void showDetails(String name, int age);// methods are by default public and abstract
}

interface showProperty{
	public void showProperty(String farm);
}

public class InterfaceDemo implements showDetails, showProperty {

	public void showDetails(String name, int age) {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}
	
	public void showProperty(String farm) {
		System.out.println("Farm name is : " + farm);
	}
	
	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.showDetails("Ram", 32);
		obj.showProperty("Paradise");
	}

}
