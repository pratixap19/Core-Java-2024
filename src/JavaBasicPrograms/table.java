package JavaBasicPrograms;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=10; i++) {
			System.out.println(number + "x" + i + " = " + (number*i));
		}
		
	}

}
