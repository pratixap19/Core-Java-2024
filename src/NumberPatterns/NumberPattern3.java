package NumberPatterns;
/*
1 
2 3 
4 5 6 
7 8 9 10 
*/
public class NumberPattern3 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++,count++) {
				System.out.print(count + " ");
				
			}
			System.out.println();
		}

	}

}
