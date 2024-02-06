package StringProgramsP;
//racecar,madam,peep,nitin,level,kayak,refer,civic,radar
public class PracticeStringDemo {

	public static void main(String[] args) {
		String s ="Hello";
		System.out.println(s.length());
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
 