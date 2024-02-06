package JavaBasicPrograms;

import java.util.Arrays;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
	
		int array[] = {56, 34, 23, 8, 79, 100};
		System.out.println(array.length);
		Arrays.sort(array);
		System.out.println("First highest element in the array is:" + array[array.length-1]);
		System.out.println("Second highest element in the array is:" + array[array.length-2]);

	}

}
