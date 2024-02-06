package StringProgramsP;
//followed Ashok IT
//example of redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.
public class ReverseGivenString {

	public static void main(String[] args) {
		//First approach
		String str = "Reviver";
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch= str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("It is palindrom");
		}
		else {
			System.out.println("It is not a palindrom");
		}
		
		System.out.println("**************************");
		
		//second approach
		String s = "QAautomation";
		for(int i=s.length()-1;i>=0;i--) { 
			 System.out.print(s.charAt(i));
		}
	}

}
