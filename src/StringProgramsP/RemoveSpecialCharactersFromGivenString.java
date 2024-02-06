package StringProgramsP;
//followed Ashok IT
public class RemoveSpecialCharactersFromGivenString {

	public static void main(String[] args) {
		String str = "$#sm%^a!r$t";
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}

}
