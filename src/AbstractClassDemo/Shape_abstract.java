package AbstractClassDemo;
//followed Naveen Automation
//we can create constructor in Abstract class but not in an interface.
//we can achieve 0 to 100% abstraction with abstract class
//we can't create object of abstract class and interface
public abstract class Shape_abstract {
	
	int color;
	
	Shape_abstract(){
		System.out.println("Shape_abstract class constructor");
	}
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape -- fill");
	}

}
