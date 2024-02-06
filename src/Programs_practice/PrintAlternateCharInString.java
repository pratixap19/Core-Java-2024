package Programs_practice;
//print alternate character in a string
import java.util.Scanner;

public class PrintAlternateCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		sc.close();
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(i%2==1) {
			   System.out.println(ch);
			}
			
		}
	}

}
