package StringProgramsH;
//indexOf()
//lastIndexOf()
//contains()
//charAt()
//endsWith()
//startsWith()

public class SearchCharacters {

	public static void main(String[] args) {
		String s="deepak";
		System.out.println(s.indexOf('e'));//1
		System.out.println(s.lastIndexOf('e'));//2
		System.out.println(s.charAt(3));//p
		System.out.println(s.contains("ep"));//true
		System.out.println(s.startsWith("d"));//true
		System.out.println(s.endsWith("a"));//false

	}

}
