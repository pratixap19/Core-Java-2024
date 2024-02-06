package Programs_practice;

import java.util.Scanner;

//Convert Character To Lower Case
public class ConvertCharacterToLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char c = sc.next().charAt(0);
		System.out.println(Character.toLowerCase(c));

	}

}
