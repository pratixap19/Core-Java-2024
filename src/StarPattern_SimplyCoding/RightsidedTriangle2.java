package StarPattern_SimplyCoding;
//increasing spaces and decresing triangle
/*
  * * * * * 
    * * * * 
      * * * 
        * * 
          **/
public class RightsidedTriangle2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");//increasing space
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");//decresing triangle
			}
			System.out.println();
		}

	}

}
