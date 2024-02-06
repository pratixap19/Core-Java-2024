package JavaBasicPrograms;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;//4 123
			sum=sum+rem;//program is same like reverse a number. only minor change in this step
			num=num/10;//123
		}
		System.out.println("Sum of digits are: " + sum);
	}

}
