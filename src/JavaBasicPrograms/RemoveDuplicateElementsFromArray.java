package JavaBasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		int a[] = {34,5,78,9,10,34,9, 34,9, 34, 9,34,10};
		Map<Integer,Integer> elcount=new HashMap<>();
		for(int i:a) {
			elcount.put(i, elcount.getOrDefault(i, 0)+1);
		if(elcount.get(i)==2) {
			System.out.print(" "+i);
		}

	}
	}
}
