package StarPattern_SimplyCoding;
//decresing space
//increasing star
//increasing star

/*        * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
*/
public class HillPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");//decresing space
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");//increasing star
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");//increasing star
			}
			System.out.println();
		}

	}

}
