package StringProgramsP;

public class CountTheVowels {

	public static void main(String[] args) {
		String s = "sElenium";
		s=s.toLowerCase();
		System.out.println(s);
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			//c=Character.toLowerCase(c);
			if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u')
			count++;
		}
		System.out.println(count);

	}

}
