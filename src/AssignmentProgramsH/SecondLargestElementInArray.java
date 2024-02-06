package AssignmentProgramsH;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] a= {23,51,86,78,79};
		int temp;
		int size = a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Second largest element in array is:" + a[size-2]);

	}

}
