package Programs_practice;
//followed Coder Bano
import java.util.Scanner;

public class CountTotalnumberOfVowelsAndConsonents {
	
	public static void count(String s) {
		//String s="AppleAndBanana";
		s=s.toLowerCase();
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetter(c)) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowel++;
				}else {
					consonent++;
				}
			}
		}
		System.out.println("Number of vowels:" + vowel);
		System.out.println("Number of consonents:" + consonent);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		sc.close();
		count(s);
	}
}
