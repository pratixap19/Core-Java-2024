package StringProgramsH;

public class PrintVowelsAndConsonents {

	public static void main(String[] args) {
		String str = "Hello Java";
		String v="";
		String x="";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v=v+c;	
			}
			else {
				x=x+c;			
			}
		}
		System.out.print(v + " ");
		System.out.println();
		System.out.println(x+ " ");

	}

}
