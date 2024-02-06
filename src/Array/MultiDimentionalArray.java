package Array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		a[0][0] = 12;
		a[0][1] = 22;
		
		a[1][0] = 32;
		a[1][1] = 42;
		
		a[2][0] = 52;
		a[2][1] = 62;
		
		System.out.println("No of rows are: " + a.length);
		System.out.println("No of columns are: " + a[0].length);
		
		System.out.println("*********************************");
		int[][] b = {{12,22}, {32,42}, {52,62}};
		
		System.out.println("No of rows are: " + b.length);
		System.out.println("No of columns are: " + b[0].length);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
