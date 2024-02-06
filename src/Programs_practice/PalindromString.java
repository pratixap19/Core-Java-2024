package Programs_practice;

import java.util.Scanner;

public class PalindromString {
	public static void palindromString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c= s.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is palindrom string");
		}else {
			System.out.println("It is not a palindrom string");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		sc.close();
		palindromString(s);

	}

}
