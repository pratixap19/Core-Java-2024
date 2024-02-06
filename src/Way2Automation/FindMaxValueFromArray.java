package Way2Automation;

public class FindMaxValueFromArray {

	public static void main(String[] args) {
		int[] ass1 = {23, 11, 8, 45, 123, 87, 250};
		int max=ass1[0];
		for(int i=0;i<ass1.length;i++) {
			if(ass1[i]>max) {
				max=ass1[i];
			}
		}
		System.out.println(max);
	}
}
