package Programs_practice;

public class SwapTwoNumbersWithoutTempVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping value of a is " + a + " and value of b is " + b);
	}
}
