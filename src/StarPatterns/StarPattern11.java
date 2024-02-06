package StarPatterns;
//followed CS Corner Sunita Rai
public class StarPattern11 {
	/*
	 ----1
     ---12
     --123
     -1234
     12345
     */
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {//it is for inverted traingle
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
		
}


