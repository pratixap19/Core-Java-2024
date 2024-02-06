package OOPsConceptPart2;
//followed Naveen Automation

//only method declaration but no method body
//no static methods in interface
//variables can be declared. variables are by default static in nature
//variable value will not be changed. It is final.
//no main method in interface
//we can not create object of interface
//interface is abstract in nature. abstract means we can't instantiate meaning we can't create object of interface.
public interface USBank {
	
	int min_balace = 100;
	
	public void credit();
	
	public void debit();

	public void tranferMoney();
}
