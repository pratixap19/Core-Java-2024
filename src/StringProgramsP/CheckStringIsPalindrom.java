package StringProgramsP;
//Simply Coding
//minor change with adding if() condition,program of reverse string becomes palindrom string.
public class CheckStringIsPalindrom {

	public static void main(String[] args) {
		String s = "too Hot to Hoot";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		String rev="";
		int len = s.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("It is palindrom string");
		}
		else {
			System.out.println("It is not palindrom string");
		}
		

	}

}
