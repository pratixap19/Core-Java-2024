package ArrayProgramsH;

public class ReverseElementsOfArray {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		System.out.println("The original array is :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("The reverse array is :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}

	}

}
