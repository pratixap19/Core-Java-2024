package AssignmentProgramsH;

public class CheckPalindromString {

	public static void main(String[] args) {
		String s="too Hot to Hoot";
		s=s.toLowerCase();
		s=s.replaceAll("\\s", "");
		String rev= "";
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is palindrom string");
		}else {
			System.out.println("It is not palindrom string");
		}
    }

}
