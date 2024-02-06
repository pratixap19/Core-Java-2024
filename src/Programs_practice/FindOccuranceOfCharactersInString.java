package Programs_practice;

import java.util.HashMap;

//Find Occurance Of each Characters In String
public class FindOccuranceOfCharactersInString {

	public static void main(String[] args) {
		String s="HelloWorldhew";
		s=s.toUpperCase();
		int k=1;
		char temp=0;
		HashMap<Character, Integer> occuranceMap=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					k++;
					occuranceMap.put(s.charAt(j), k);
					temp=s.charAt(j);
					break;
				}
			}
		}
		System.out.println(occuranceMap);

	}

}
