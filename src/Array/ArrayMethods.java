package Array;
////Arrays methods are sort(), Equals(), copyOf(), fill(), biarySearch()
import java.util.Arrays;
public class ArrayMethods {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		num[0] = 78;
		num[1] = 18;
		num[2] = 70;
		num[3] = 68;
		num[4] = 12;
		
		System.out.println("Length of array is = " + num.length);
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Printing array before sorting = " + num[i]);
		}
		
		System.out.println("======================================================");
		Arrays.sort(num);//sorting array
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Printing array after sorting = " + num[i]);
		}

	}

}
