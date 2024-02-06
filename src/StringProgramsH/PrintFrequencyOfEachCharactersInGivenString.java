package StringProgramsH;

public class PrintFrequencyOfEachCharactersInGivenString {

	public static void main(String[] args) {
		
		String s="Java programming Java oops";
		int totalCount=s.length();
		int totalCount_afterRemovingCharacters=s.replace("a", "").length();
		System.out.println("total count after removing repitetive characters: " + totalCount_afterRemovingCharacters);
		int count=totalCount-totalCount_afterRemovingCharacters;
		System.out.println("Number of occurances of a is:" + count);
	}

}
