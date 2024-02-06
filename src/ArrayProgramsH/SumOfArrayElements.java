package ArrayProgramsH;

public class SumOfArrayElements {

	public static void main(String[] args) {
	int[] a= {5,2,7,9,6,10};
	int sum=0;
//	for(int value:a) {
//		sum=sum+value;
//	}
//	System.out.println(sum);
	
	for(int i=0;i<=a.length-1;i++) {//i<=a.length-1 == i<a.length
		sum=sum+a[i];
	}
	System.out.println(sum);
	
	}
}
