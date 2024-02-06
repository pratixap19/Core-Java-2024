package AbstractClassDemo;
//followed Naveen Automation
//when we create object of child class then it will call first parent class constructor and then child class constructor
public class Test_abstrac extends Shape_abstract{
	
	Test_abstrac(){
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		//Shape_abstract sv = new Shape_abstract{();//we can't create object of abstract class
		 Shape_abstract sv = new Test_abstrac();//but we can create reference of abstract class and it can point to child class
		 sv.drawing();
		 sv.fill();
		//Test_abstrac ta = new Test_abstrac();
		
	}

	@Override
	void drawing() {
		System.out.println("Test -- drawing");
		
	}
	
//	public void fill() {
//		System.out.println("Test_abstract -- fill");
//	}

}
