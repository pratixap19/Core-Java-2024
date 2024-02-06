
package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
import java.util.Arrays;

//followed SDET - Pavan 2024 new series
public class SortingElementsInArrays {

	public static void main(String[] args) {
		
		int a[] = {10,42,45,26,20};
		System.out.println("Before sorting" + Arrays.toString(a));
		//Arrays.toString(a) method will give each elements of the array. instead of writing for loop
		//we can use Arrays.toString method which is short cut to print elements of arrays.
		Arrays.sort(a);
		System.out.println("After sorting" + Arrays.toString(a));
		
		char c[] = {'d', 'f', 't', 'a'};
		System.out.println("Before sortig: " + Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("After sortig: " + Arrays.toString(c));
		
		String[] s = {"scott", "mary", "mathew", "John"};
		Arrays.sort(s);
		System.out.println("After sortig: " + Arrays.toString(s));
		
		
	}

}
