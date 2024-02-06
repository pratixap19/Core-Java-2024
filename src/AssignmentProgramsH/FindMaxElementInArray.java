package AssignmentProgramsH;

public class FindMaxElementInArray {

	public static void main(String[] args) {
		
		int[] a={23,56,90,34,61,51,562};
		int temp;
		int s=a.length;
		for(int i=0;i<s;i++ ) {
			for(int j=i+1;j<s;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("Print array in sort order");
		for(int i=0;i<s;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Highest element is: " + a[s-1]);

	}

}
