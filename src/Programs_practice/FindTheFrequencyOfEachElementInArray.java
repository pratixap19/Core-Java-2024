package Programs_practice;

import java.util.HashMap;
import java.util.Map.Entry;

//FindTheFrequencyOfEachElementInArray
public class FindTheFrequencyOfEachElementInArray {

	public static void main(String[] args) {
		int[] a= {1,5,7,5,1,3,9,7,9};
		//whenever we need key and value pair in that situation we need HashMap
		HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>(); 
		for(int num:a) {
			//getOrDefault(num, 0)+1 meaning if the element is already present increment the count 
			//otherwise it will mention 1.
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		for(int keySet :frequencyMap.keySet()) {
			System.out.println(keySet+ " " + frequencyMap.get(keySet));
		}
	}

}
