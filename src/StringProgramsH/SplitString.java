package StringProgramsH;
//followed QAFox
public class SplitString {

	public static void main(String[] args) {
		String s = "Split and count the number of words in the sentence";
		String[] p = s.split(" ");
		System.out.println("Number of words in a sentence are: " + p.length);
		for(String temp:p) {
			System.out.println(temp);
		}
		
		System.out.println("**************************");
		
		String s1 = "Java-programming-is-fun";
		String[] p1 = s1.split("-");
		System.out.println("Number of words in a sentence are: " + p1.length);
		for(String temp1:p1) {
			System.out.println(temp1);
		}
		
		System.out.println("**************************");
		
		String s3="Selenium the software testing skill the easiest skill to develop";
		String[] p2 = s3.split("the");
		//System.out.println("Number of words in a sentence are: " + p2.length);
		for(String temp2:p2) {
			System.out.println(temp2);
		}
	}

}
