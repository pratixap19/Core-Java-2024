package NumberProgramsH;
//Sum of the numbers
import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num = sc.nextInt();
		sc.close();
		int rem;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}

