package Way2Automation;

public class FindSumOfArrays {

	public static void main(String[] args) {
		//find sum of array
		
		int[] ass1 = { 23, 11, 8, 45, 123, 87 };
		int sum = 0;
		for (int i = 0; i < ass1.length; i++) {
			sum = sum + ass1[i];
		}
		System.out.println("Sum of array is:" + sum);		
	}
}
