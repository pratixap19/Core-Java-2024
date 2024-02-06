package OOPsConceptPart2;
//followed Naveen Automation
public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_balace);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.tranferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		System.out.println("****************************");
		
		//dynamic polymorphism - child class object can be reffered by parent interface reference variable.
		//only overridden methods can be called
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.tranferMoney();
		
	}

}
