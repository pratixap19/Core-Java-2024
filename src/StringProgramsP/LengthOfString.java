package StringProgramsP;
//followed ABC-Technology training & upskilling
//computing length of string without using length() method
public class LengthOfString {
	
	public static void countLength() {
//		String str = "ABC Tech";
//		str.concat("\0");//add null value
//		char[] ch = str.toCharArray();
//		int i=0;
//		int count=0;
//		while(ch[i]!='\0') {
//			++count;
//			++i;
//		}
//		System.out.println("Length of the string is: " + count);
	}

	public static int lengthOfString() {
		String str = "ABC Tech";
		System.out.println("Length:" + str.toCharArray().length);
		int count=0;
		char[] x = str.toCharArray();
		for(char y:x) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Length of the string is: " + lengthOfString());
		
	}

}
