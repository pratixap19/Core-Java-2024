package AbstractClassDemo;

public abstract class Vehicle {
	
		String name;
		
		public Vehicle(String n) {// we can create constructor in Abstract class but not in an interface.
			name=n;
		}
		//abstract method
		public abstract void run();
		
		//non abstract method
		public void testMethod() {
			System.out.println("This is non abstract method of Vehical class");
		}
}
