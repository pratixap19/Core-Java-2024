package Programs_practice;

import java.util.Scanner;

//write a function to reverse a number
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		
		//int temp=num;
		int rem;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);

	}

}
