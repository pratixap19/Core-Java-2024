package Programs_practice;

import java.util.Scanner;

public class CountTotalNumberOfCharactersInString {
	public static void countCharacters(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		sc.close();
		countCharacters(str);
	}

}
