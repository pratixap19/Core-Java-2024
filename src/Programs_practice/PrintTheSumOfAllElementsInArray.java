package Programs_practice;

public class PrintTheSumOfAllElementsInArray {

	public static void main(String[] args) {
		int[] a = {2,6,4,9,3,6,10,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
