package StringProgramsP;
//followed Ashok IT
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "  J a va s ta r ";
		str=str.trim(); //trim() will remove leading and trailing white spaces 
		System.out.println(str);
		str= str.replaceAll("\\s", "");// unicode \\s represents single space
		System.out.println(str);
	}

}
