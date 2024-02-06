package StringProgramsH;

public class RepetedCharacters {

	public static void main(String[] args) {
		String s = "Java programming Java oops";
		s=s.replaceAll("\\s", "");
		//System.out.println(s);
		int[] characterFrequency = new int[128];
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);//j
			characterFrequency[c]++;
		}
		
		for(int i=0;i<characterFrequency.length; i++) {
			if(characterFrequency[i]>0) {
				System.out.println((char)i+ " " + characterFrequency[i]);
			}
		}

	}

}
