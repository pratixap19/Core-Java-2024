package StringProgramsP;

public class CreateNewStringAfterRemovingAllspacesInAString {

	public static void main(String[] args) {
		//First approach
		String r ="";
		String str = "NO26 Sound";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!Character.isWhitespace(c)) {
				r=r+c;
			}
		}
		System.out.println(r);
		
		//Second approach
		String std = "I am QA Automation Engineer";
		std = std.trim();
		std = std.replaceAll("\\s", "");
		System.out.println(std);
		
	}

}
