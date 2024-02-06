package StarPatterns;
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 		
 */
public class StarPattern8 {

	public static void main(String[] args) {

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
				//System.out.print(j+ " ");
			}
			System.out.println();
		}
		//System.out.println("************************");
		// reverse pattern

		for (int i=1; i<=4; i++) {
			for (int j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
