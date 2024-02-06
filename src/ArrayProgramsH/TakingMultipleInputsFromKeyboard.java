package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of two numbers:" + (num1+num2));*/
		
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Your name is:" + name);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Your age is:" + age);
		
		System.out.println("Enter unknown value");
		Object value = sc.next();//sc.next() will take any value as String. we can use sc.next() for any type of data.
		System.out.println("Unknown value is: " + value);
		
	
		
		
		
	}

}
