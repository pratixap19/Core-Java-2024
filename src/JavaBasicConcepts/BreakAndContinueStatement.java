package JavaBasicConcepts;
//Jump statements-break, continue
public class BreakAndContinueStatement {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++){

			if (i==5)
				break;
			System.out.println("Value of i is:" + i);
		}
		System.out.println("for loop excited");
		
	System.out.println("**************************");
	
	for(int j=0;j<=10;j++) {
		if(j==5)
			continue;
		System.out.println("Value of j is:" + j);
	}
	System.out.println("for loop excited");
}
}
