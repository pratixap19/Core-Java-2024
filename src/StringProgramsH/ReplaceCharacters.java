package StringProgramsH;
//replace(),replaceFirst(),replaceAll()
//regular expression is used with replaceAll() only
public class ReplaceCharacters {

	public static void main(String[] args) {
		String s1="This is demo";
		//System.out.println(s1.replace("i", "z"));
		System.out.println(s1.replace("is", "was"));//Thwas was demo
		System.out.println(s1.replaceAll("was", "is"));//This is demo
		System.out.println(s1.replaceFirst("is", "was"));//Thwas is demo
		System.out.println(s1.replace("was", "is"));//This is demo
		System.out.println(s1.replaceAll("is(.)", "was"));//Thwaswasdemo
		
		System.out.println("====================");
		String s2="@#$%latin string 01234567890";
		s2=s2.replaceAll("[^a-zA-Z0-9]", "");//^ means other than that
		System.out.println(s2);//latinstring01234567890
		
		String s3="@#$%^&* testing #@$%& Selenium !&&&#$@* Java";
		s3=s3.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s3);//testingSeleniumJava
		
		String s4="1234Pratixa Patel123";
		s4 = s4.replaceAll("[^a-zA-Z]", "");
		System.out.println(s4);

	}

}
