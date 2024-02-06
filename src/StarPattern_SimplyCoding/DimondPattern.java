package StarPattern_SimplyCoding;
//Hill pattern
//reverse hill pattern
public class DimondPattern {

	public static void main(String[] args) {
		//hill pattern
		int n=5;
		for(int i=1;i<n;i++) {
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
		//reverse hill pattern
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
