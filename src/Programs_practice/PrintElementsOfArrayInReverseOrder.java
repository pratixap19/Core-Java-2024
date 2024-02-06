package Programs_practice;

public class PrintElementsOfArrayInReverseOrder {

	public static void main(String[] args) {
		int[] a = {99,468,23,62,19,39,41};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
