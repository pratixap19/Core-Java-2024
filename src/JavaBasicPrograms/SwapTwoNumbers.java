package JavaBasicPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		/*int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a is storing " + a);
		System.out.println("b is storing " + b);*/
		
		//without using temp variable
		a=a+b;//13
		b=a-b;//5
		a=a-b;//8
		System.out.println("After swapping two numbers " + "the value of a is = " + a + " and" + " value of b is = " + b);

	}

}
