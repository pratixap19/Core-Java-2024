package AssignmentProgramsH;
/*
   1
   23
   456
   78910*/
public class Assignment_numPattern2 {

	public static void main(String[] args) {
		int n=4;
		int p=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}

	}

}
