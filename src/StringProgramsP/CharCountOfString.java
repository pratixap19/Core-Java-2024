package StringProgramsP;
//No of letters present in the String
public class CharCountOfString {

	public static void main(String[] args) {
		//String s = "I am sorry";
		String s = "ABC Tech";
		int len = s.length();
		System.out.println(len);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of characters in a string: " + count);
	}

}
