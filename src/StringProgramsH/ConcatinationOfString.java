package StringProgramsH;

public class ConcatinationOfString {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int str3=100;
		int str4=150;
		System.out.println(str3+str4+str1+str2);//250HelloWorld
		System.out.println(str1+str2+str3+str4);//HelloWorld100150
		System.out.println(str3+str1+str2+str4);//100HelloWorld150

	}

}
