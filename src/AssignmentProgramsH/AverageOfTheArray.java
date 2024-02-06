package AssignmentProgramsH;

public class AverageOfTheArray {

	public static void main(String[] args) {
		int[] a={23,56,90,34,61,51};
		int avg=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			avg=sum/a.length;
			
		}
		System.out.println("Average of the array is: " + avg);

	}

}
