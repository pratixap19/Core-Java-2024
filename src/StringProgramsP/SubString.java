package StringProgramsP;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		//Please enter my name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String value = sc.next();
		//sc.close();
		
		int length = value.length();
		for(int i=0;i<length;i++) {
			for(int j=1;j<length-i;j++) {
				String sub = value.substring(i, j+i);
				System.out.println(sub);
			}
		}
		
		

	}

}
