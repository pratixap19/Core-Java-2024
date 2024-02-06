package StringProgramsP;

public class TotalNoOfGivenCharacters {

	public static void main(String[] args) {
		int count = 0;
		String s = "aaaaaaaaaaaaabfgrmnuhke";
		int len = s.length()-1;
		
		for(int i=0;i<=len;i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
		
//		char a[] = s.toCharArray();
//		System.out.println(a);
//		s = s.replace('a', 'b');
//		System.out.println(s);
	}

}
