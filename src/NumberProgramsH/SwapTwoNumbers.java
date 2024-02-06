package NumberProgramsH;

import java.util.Scanner;

public class SwapTwoNumbers {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter first num");
			int num1 = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter second num");
			int num2 = sc2.nextInt();
			
			int temp;
//			num1=num1+num2;//9//num1 =5, num2 = 3, num1=8
//			num2=num1-num2;//8-3=5 num2 =5
//			num1=num1-num2;
			
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.println("Value of num1 is : " + num1  +" "+"value of num2 is :" + num2);
		}
}
