package StringProgramsH;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any statement having multiple words");//Learning Java programming is fun
		String str = sc.nextLine();
		sc.close();
		String[] str1 = str.split(" ");
		System.out.println("The number of words in the given string text is: " + str1.length);
		for(String s:str1) {
			System.out.println(s);
		}
	}
}
