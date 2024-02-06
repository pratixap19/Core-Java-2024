package StringProgramsP;
//white space created by tab key. str=str.replaceAll("\\t", "") will remove white 
//space created by tab.
//white space created by space bar. str=str.replaceAll(" ", "") will remove all white
//space created by space bar.
//str.replaceAll("\\s", "") will remove all white space created by tab and space bar.
public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		String str = "I am Pratixa Patel	I am	software	professional";
		str = str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
