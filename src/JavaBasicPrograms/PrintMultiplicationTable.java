package JavaBasicPrograms;

import java.util.Scanner;

//followed QAFox
public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}		
	}

}
