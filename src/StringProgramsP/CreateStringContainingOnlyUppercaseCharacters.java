package StringProgramsP;
//Simply Coding
public class CreateStringContainingOnlyUppercaseCharacters {

	public static void main(String[] args) {
		String s="Its Simple";
		String sn = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c))
				sn=sn+c;
		}
		System.out.println(sn);

	}

}
