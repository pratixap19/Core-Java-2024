package StarPattern_SimplyCoding;
//decresing space and increasing triangle
/*
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
 */
public class RightsidedTriangle1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");//decresing space
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");//increasing triangle
			}
			System.out.println();
		}

	}

}
