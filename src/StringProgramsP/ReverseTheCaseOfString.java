package StringProgramsP;

public class ReverseTheCaseOfString {

	public static void main(String[] args) {
		String str = "NO26 Sound";
		String r = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				r=r+Character.toLowerCase(c);
			}else {
				r=r+Character.toUpperCase(c);
			}
		}
		System.out.println(r);
		

	}

}
