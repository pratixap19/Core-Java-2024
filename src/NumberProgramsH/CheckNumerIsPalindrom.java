package NumberProgramsH;

import java.util.Scanner;

public class CheckNumerIsPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();//879
		int originalNumer=num;
		int rev=0;
		int rem;
		while(num>0) {
			rem=num%10;//879%10=9
			rev=(rev*10)+rem;//9
			num=num/10;//879/10=87
		}
		
		System.out.println(rev);
		if(originalNumer==rev) {
			System.out.println("It is palindrom");
		}
		else{
			System.out.println("It is not a palindrom");
		}

	}

}
