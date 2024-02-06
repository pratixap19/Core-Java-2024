package ArrayProgramsH;

public class OddEvenNumbersInArray {

	public static void main(String[] args) {
		int[] a={2,67,35,89,12,46, 100};
		System.out.println("Odd numbers are:-");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even numbers are:-");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
