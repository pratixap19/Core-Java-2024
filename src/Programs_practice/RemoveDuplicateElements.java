package Programs_practice;
//Write a code to filter duplicate elements from an array and print as a list
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int[] a = {12,45,56,23,45,12,13,13,56};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer x:set) {
			System.out.println(x);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		

	}

}
