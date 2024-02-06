package StringProgramsP;
//example of redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.
public class PalindromString {

	public static void main(String[] args) {
		//First approach
		String s = "too Hot to Hoot";
		int lenghth = s.length();
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(lenghth-i-1)){
					System.out.println("s is not a palindrom");
			}
			
		}
		 {
			System.out.println("s is a palindrom");
		}
		 
		 System.out.println("*******************************");
		 
		//SecondApproach - followed simply coding
		 
		 String str = "REfer";
		 //str=str.toLowerCase();
		 String rev ="";
		 for(int i=0;i<str.length();i++) {
			 char c = str.charAt(i);
			 rev = c+rev;
		 }
		 if(str.equalsIgnoreCase(rev)) {
			 System.out.println("It is palindrom string");
		 }
		 else {
			 System.out.println("It is not a palindrom string");
		 }
	}
}


