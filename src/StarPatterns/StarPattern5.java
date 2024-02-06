package StarPatterns;

/*
    *
   **
  ***
 ****
***** 
****  
***   
**    
*    

*/
public class StarPattern5 {

	public static void main(String[] args) {
		
		//upper triangle
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower triangle
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
