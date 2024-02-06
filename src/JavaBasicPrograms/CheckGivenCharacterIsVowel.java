package JavaBasicPrograms;

import java.util.Scanner;

public class CheckGivenCharacterIsVowel {

	public static void main(String[] args) {
		//vowel = a,e,i,o,u
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		
		char c = scanner.next().charAt(0);
		scanner.close();
		
		//write logic for checking whether the character entered by user is vowel
		boolean isVowel = false;
		
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'B':
			case 'C':
			case 'E':
			isVowel = true;
		}
		if(isVowel) {
			System.out.println(c + " is a vowel");
		}else {
			System.out.println(c + " is not a vowel");
		}
		
		

	}

}
