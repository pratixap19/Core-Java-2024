package Array;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		int[] roll = new int[5];
		roll[0] = 10;
		roll[1] = 20;
		roll[2] = 30;
		roll[3] = 40;
		roll[4] = 50;
		
		System.out.println("Length of array is: " + roll.length);
		System.out.println("Value of 4th element is :" + roll[3]);
		
		for(int i=0; i<roll.length;i++) {
			System.out.println(roll[i]);
		}
		
		System.out.println("**********************************");
		
		int[] rollNum = {12, 22, 32, 42, 52, 62};
		for(int element:rollNum) {
			System.out.println(element);
		}
	}

}
