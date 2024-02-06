package StringProgramsH;
//followed Coder Bano
import java.util.Scanner;

public class CountVowelsAndConsonents {
	
	public static void count(String str) {
		int vowels=0, consonents=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch) && ch!=' ') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonents++;
				}
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonents:" + consonents);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next();
		sc.close();
		count(str);
	}

}
