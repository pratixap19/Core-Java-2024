package Programs_practice;

import java.util.Arrays;

public class SortAnArrayElements {

	public static void main(String[] args) {
		int[] a = {3,9,4,6,3,8,5,2,10};
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
		System.out.println("Sorted array elements: " + Arrays.toString(a));

	}

}
