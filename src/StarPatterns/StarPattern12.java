package StarPatterns;

public class StarPattern12 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 *1
		 121
		12321
	   1234321	
		*/
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("-");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for(int m=i-1; m>=1; m--) {
				System.out.print(m);
			}
			System.out.println(); 
		}

	}

}
