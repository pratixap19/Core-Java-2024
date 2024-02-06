package Programs_practice;

import java.util.Scanner;

public class ReverseString {

	public static void reverseString(String s) {
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s =sc.next();
		sc.close();
		reverseString(s);
	}

}
