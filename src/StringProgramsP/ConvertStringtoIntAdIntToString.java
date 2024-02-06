package StringProgramsP;

public class ConvertStringtoIntAdIntToString {

	public static void main(String[] args) {
		
		String a = "65";
		int x=Integer.parseInt(a);
		System.out.println("Conversion from string to int: " + x);
		
		int b = 65;
		String s = Integer.toString(b);
		System.out.println("Conversion from int to String: " + s);
	}

}
