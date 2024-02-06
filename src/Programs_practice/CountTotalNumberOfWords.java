package Programs_practice;

import java.util.Scanner;

public class CountTotalNumberOfWords {
	public static void countCharacters(String str) {
		String[] str1 = str.split(" ");
		System.out.println("Total number of words are:" + str1.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		sc.close();
		countCharacters(str);
	}

}
