package StringProgramsP;
//Input: "I AM  in   meeting” Write a genric way so that I get output as "I AM in meeting"
public class WriteAGenericWayString {

	public static void main(String[] args) {
		
		String s = " I AM  in   meeting ";
		s=s.trim();
		s=s.replaceAll("\\s+", " ");//It will trim space, between two words 
		//s=s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
