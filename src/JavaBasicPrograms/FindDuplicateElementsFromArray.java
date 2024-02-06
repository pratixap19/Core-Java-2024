package JavaBasicPrograms;

import java.util.Arrays;

public class FindDuplicateElementsFromArray {

	public static void duplicateelements() {
		int[] arr = {3,5,3,5,4,3,4};
		Arrays.sort(arr);
		System.out.println("Duplicate elements in given array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
				}
			}

		}
	}

	public static void main(String[] args) {
		FindDuplicateElementsFromArray.duplicateelements();
	}

}
