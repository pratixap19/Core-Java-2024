package StringProgramsP;

public class PrintOnlyUppercaseCharacters {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			//System.out.println(c + " " + (int)c);
			if(Character.isUpperCase(c)) {
				System.out.println(c);
			}
			
		}
	}
}
