package ArrayProgramsH;
//bubble sort
//followed SDET - Pavan 2024 new series
import java.util.Arrays;

public class SortingElementsUsingForLoop {

	public static void main(String[] args) {
	int[] a = {4,2,1,5,3};
	System.out.println("Array before sorting :" + Arrays.toString(a));
	
	int n=a.length;
	for(int i=0;i<n-1;i++) {//number of passes
		for(int j=0;j<n-1;j++) {//iterations in each pass
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("arrays after sorting:" + Arrays.toString(a));

	}

}
