package Polymorphism;
//Method must have same name and parameter as in parent class.
//A method declared in parent class as final or static, can't be overridden.
//The access level can't be more restrictive than the overridden's access level.
//Visibility can't be reduced
class Bank {

	double getRateOfInterest() {
		return 0.0;
	}
}

class DCU extends Bank {
	double getRateOfInterest() {
		//change body
		return 5.0;
	}
}

class BOA extends Bank {
	double getRateOfInterest() {
		//change body
		return 6.0;
	}
}

class Citizen extends Bank {
	double getRateOfInterest() {
		//change body
		return 7.0;
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		DCU obj = new DCU();
		System.out.println("Interest rate of DCU : " + obj.getRateOfInterest());
		
		BOA obj1 = new BOA();
		System.out.println("Interest rate of BOA : " + obj1.getRateOfInterest());
		
		Citizen obj2 = new Citizen();
		System.out.println("Interest rate of Citizen : " + obj2.getRateOfInterest());
	}
}
