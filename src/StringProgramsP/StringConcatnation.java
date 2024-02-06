package StringProgramsP;

import java.util.Scanner;

public class StringConcatnation {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first strings");
		s1 = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second strings");
		s2 = sc1.nextLine();
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		

	}

}
