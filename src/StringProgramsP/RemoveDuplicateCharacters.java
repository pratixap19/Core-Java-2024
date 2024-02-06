package StringProgramsP;

import java.util.LinkedHashSet;
import java.util.Set;

//followed Ashok IT
//1.Using Java 8
//2.Using indexOf()
//3.Using Character array
//4. Using Set interface method
public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		//Using set interface
		String str="cocconut";
		
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		
		System.out.println("*****************");
		
		StringBuffer sb = new StringBuffer();
		for(Character c:set) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
