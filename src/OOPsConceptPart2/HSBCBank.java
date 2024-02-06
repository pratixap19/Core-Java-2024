package OOPsConceptPart2;
//followed Naveen Automation
//If a class is implementing any interface, then its mandatory to define/override all the methods of interface.
//Is-a relationship means interface to class relationship.
//Has-a relationship means class to class relationship.
public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance. It is called Is a relationship.
	
	//First three methods are overriden from USBank interface
	@Override
	public void credit() {
		System.out.println("HSBC - credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC - dedit");
	}

	@Override
	public void tranferMoney() {
		System.out.println("HSBC - transferMoney");
	}
	
	//Separate methods from HSBCBank class 
	public void educationLoan() {
		System.out.println("HSBC - educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC - carLoan");
	}

	//overriden from BrazilBank interface
	@Override
	public void mutualFund() {
		System.out.println("HSBC - mutualFund");
	}

}
