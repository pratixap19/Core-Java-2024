package Programs_practice;
//Find First Two Max Values From Array
import java.util.Arrays;

public class FindFirstTwoMaxValuesFromArray {

	public static void main(String[] args) {
		int[] a = {12,45,56,23,45,12,13};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//Arrays.toString() method is used to print array. We can use it instead of for loop
		System.out.println("Arrays elements in sorting order:" + Arrays.toString(a));
		System.out.println("First two max values from array is:" + a[a.length-1]+ "," + +a[a.length-2]);
		//System.out.println("Second max value:" + a[a.length-2]);

	}

}
