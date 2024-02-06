package JavaBasicPrograms;

public class ManipulateString {

	public static void main(String[] args) {
		String s = "123Pratixa45678Patel";
		String s1 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println("s1---->" + s1);
		String newString = s.replaceAll("[123]", "").trim();
		System.out.println(newString);
		String newString1 = newString.replaceAll("[45678]", "");
		System.out.println(newString1);
		String fs = newString1.replaceAll("\\s", "");
		System.out.println(fs);
	}

}
 