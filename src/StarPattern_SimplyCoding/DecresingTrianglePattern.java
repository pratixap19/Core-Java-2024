package StarPattern_SimplyCoding;
//decresing triangle 
//followed Simply coding 
//decresing triangle
/*
* * * * *    
* * * * 
* * * 
* * 
* 
*/
//incresing triangle
/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/
public class DecresingTrianglePattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");//decresing star
			}
			System.out.println();
		}

	}

}
