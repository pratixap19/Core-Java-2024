package Programs_practice;

public class ReplaceLowercaseWithUppercaseCharactersInString {

	public static void main(String[] args) {
		String s="Nova123 ScotiA";
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				r=r+Character.toLowerCase(c);
			}else {
				r=r+Character.toUpperCase(c);
			}
		}
		System.out.println(r);
	}
}
