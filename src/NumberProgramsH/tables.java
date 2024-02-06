package NumberProgramsH;

import java.util.Scanner;

public class tables {
	public static void main(String[] args) {
		//5*1=5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++ ) {
			System.out.println(num + "x" +i+ "="  + (num*i));
		}
	}
}
