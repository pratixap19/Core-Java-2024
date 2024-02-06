package StringProgramsP;
//followed Technosage
public class ReverseString {

	public static void main(String[] args) {
		//first logic
		String s = "Aelexander";
		char ch[] = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
		
		//second logic
		String str = "smart";
		String rev= "";
		for(int i=str.length()-1; i>=0; i--) {
			//rev = rev + str.charAt(i);
			System.out.print(str.charAt(i));
		}
		//System.out.println("Reverse string is: " + rev);
		 
	}
	
		//third logic
		String str = "Interview";
		StringBuffer sb = new StringBuffer(str);
		//System.out.println(sb.reverse());
		

}
