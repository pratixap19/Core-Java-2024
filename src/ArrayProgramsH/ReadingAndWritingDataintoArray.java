package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataintoArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a value for the position "+i+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array elements.........");
		System.out.println(Arrays.toString(a));

	}

}
