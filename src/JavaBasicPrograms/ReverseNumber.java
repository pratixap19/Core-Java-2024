package JavaBasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		// 1. Using algorithm
		int rev=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num = num/10;
		}
		System.out.println(rev);
		 

		// Using StringBuffer class

		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse number is : " + rev);*/
		
//		//using StringBuilder class
//		StringBuilder sbc = new StringBuilder();
//		sbc.append(num);
//		StringBuilder rev = sbc.reverse();
//		System.out.println("Reverse number is : " + rev);

	}

}
