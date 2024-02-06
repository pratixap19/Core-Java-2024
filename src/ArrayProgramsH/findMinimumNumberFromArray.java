package ArrayProgramsH;

public class findMinimumNumberFromArray {

	public static void main(String[] args) {
		int[] a = {4,3,5,2,8,1,6};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimun number is:" + min);
	}

}
