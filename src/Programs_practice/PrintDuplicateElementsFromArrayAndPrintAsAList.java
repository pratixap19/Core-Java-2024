package Programs_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicateElementsFromArrayAndPrintAsAList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] a = {12,45,56,23,45,12,13,13,56, 100,105};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num:a) {
			if(set.add(num)) {
				list.add(num);
			}
		}
		System.out.println(list);
	}

}
