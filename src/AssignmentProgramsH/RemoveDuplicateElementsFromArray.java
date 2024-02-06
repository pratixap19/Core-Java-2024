package AssignmentProgramsH;

import java.util.HashSet;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		//int[] a = {1,3,2,4,2,3,4,5,5};
		int[] a = {1,1,2,2,2,3,3,4,5,5,6,7,7};
		
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(Integer element:hs) {
			System.out.println(element);
		}

	}

}
