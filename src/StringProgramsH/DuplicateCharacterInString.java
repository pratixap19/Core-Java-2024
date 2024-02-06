package StringProgramsH;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String s = "Java";
		for(int i=0;i<s.length();i++) {//4 times
			char c = s.charAt(i);  //j
			System.out.println(s.indexOf(c)+"-"+i);
			
			
			if(s.indexOf(c)!=i) {  //1 a
				System.out.println(s.indexOf(c)+"----inside "+i);

				System.out.println(c);
			}
		}
	}

}
