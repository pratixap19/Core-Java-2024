package StringProgramsP;
//followed Simply coding - Java String
public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello";
		s=s.toUpperCase();
		System.out.println(s);//HELLO
		
		System.out.println("***************************");
		//convert premitive type to String
		String s4 = String.valueOf(false);
		System.out.println(s4);
		
		String s5 = String.valueOf('A');
		System.out.println("s5 = " + s5);
		
		String s6 = String.valueOf(true);
		System.out.println("s6 = " + s6);
		
		String s7 =String.valueOf(25);
		System.out.println("s7 = " + s7);
		
		String s8 = String.valueOf(20.20);
		System.out.println("s8 = " + s8);
		
		System.out.println("***************************");
		
		String s1="Simply";
		String s2="Coding";
		s1 = s1.concat(s2);
		System.out.println(s1);
		//String s3= s1.concat(s2);
		//System.out.println(s3);
		
		System.out.println("Give the output of following");
		//String immutability
		String str = "replace";
		str.toUpperCase();
		System.out.println(str);
		
		//index in java
		String str1 = "Hello";
		System.out.println(str1.charAt(1));
		System.out.println(str1.substring(2, 4));
		
		//convert String to premitive
		String str3 = "46.2";
		float f = Float.parseFloat(str3);
		System.out.println(f);
		String str4 = "56.89";
		float f1 = Float.valueOf(str4);
		System.out.println(f1);
		
		//Use member methods
		String s10 = "good";
		String s20 = "going";
		String s11 = s10.concat(s20);
		System.out.println(s11);
		
		System.out.println(s11.replace('g', 'f'));
		
		System.out.println("********************");
		//Extract last character from a string
		String s12 = "Selenium";
		char str12 = s12.charAt(s12.length()-1);
		System.out.println(str12);
		
		System.out.println("********************");
		String a1="Computer";
		String a2 = "Compute";
		int i = a1.compareTo(a2);
		System.out.println(i);
		
		System.out.println("********************");
		String str13 = Character.toString('A');
		System.out.println(str13);
		
		
		
		
		
		

	}

}
