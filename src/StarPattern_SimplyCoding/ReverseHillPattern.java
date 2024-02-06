package StarPattern_SimplyCoding;
//increasing space
//decresing star
//decresing star
/*
 * * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * */
public class ReverseHillPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");//increasing space
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");//decresing star
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");//decresing star
			}
			System.out.println();

		}

	}

}
