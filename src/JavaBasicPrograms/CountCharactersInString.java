package JavaBasicPrograms;

public class CountCharactersInString {
	
	public static int countCharacters() {
		String s = "Today is Wednesday";
		int count=0;
		System.out.println("Length of the string is:" + s.length());
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		//System.out.println("Counts of characters in a string is: " + count);
		return count;
	}

	public static void main(String[] args) {
		//countCharacters();
		System.out.println("Total counts of characters in String: " +countCharacters());
	}

}
