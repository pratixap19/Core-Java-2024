package ArrayProgramsH;

public class AverageOfElementsInArray {

	public static void main(String[] args) {
		int[] a = {100,4,6,20,30};
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			avg=sum/a.length;
		}
		System.out.println(avg);
	}

}
