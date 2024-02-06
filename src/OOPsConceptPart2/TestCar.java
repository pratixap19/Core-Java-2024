package OOPsConceptPart2;
//followed Naveen Automation
//when same method present in parent class as well as in child class 
//with the same name and same number of arguments is called method overriding.
//when method with same name and parameters are available in parent as well as child class
//then preference is given to child class method which is called method overriding
public class TestCar {

	public static void main(String[] args) {
	
		//static polymorphism or compiletime polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("****************************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("****************************");
		
		//child class object can be reffered by parent class reference variable is called
		//dynamic or run time polymorphism or top csting.
		//common methods of the classes and parent class methods can be called using dynamic polymorphism.
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down casting
		// this is possible but it will give you ClassCastException.
		//BMW b1 = (BMW) new Car();
		
		
		
		
		
		
		
		

	}

}
