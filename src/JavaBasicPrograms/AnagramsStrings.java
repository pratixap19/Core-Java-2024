package JavaBasicPrograms;
//followed ABC - Technology Training & Upskilling
//Anagrams are string having same characters with the same frequencies.
//steps
//1. Take two Strings as input
//2. Convert them to character array
//3. sort two Strings using Arrays.sort method
//compare two strings with equals() method
import java.util.Arrays;

public class AnagramsStrings {

	public static void main(String[] args) {
		
		String s1 = "keep";
		String s2 = "peek";
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("Two strings are anagram");
		}
		else {
			System.out.println("Two strings are not anagram");
		}

	}

}
