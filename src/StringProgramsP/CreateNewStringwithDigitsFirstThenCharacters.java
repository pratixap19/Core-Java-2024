package StringProgramsP;
//Simply Coding
public class CreateNewStringwithDigitsFirstThenCharacters {

	public static void main(String[] args) {
		String str="NO26So12und56";
		String d="";
		String r="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)==true) {
				d=d+c;
			}
			else {
				r=r+c;
			}
		}
		String newString = d+r;
		System.out.println(newString);

	}

}
