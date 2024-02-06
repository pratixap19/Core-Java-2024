package JavaBasicPrograms;

public class SortingProcesswithoutUsingInbuildMethod {

	public static void main(String[] args) {
		int[] a = {3,1,9,5,11};
		int highest=a[0];
		int secondHighest=a[0];
		
		System.out.println("Length of array is :" + a.length);
		for(int i=1;i<a.length;i++) {
			if(a[i]>highest) {//
				secondHighest=highest;//secondHieghesr=1, 3, 5, 9
				highest=a[i];//highest = 9,11
				
			}
			else if(a[i]>secondHighest && a[i]!=highest) {
				secondHighest=a[i];
			}
		}
		System.out.println(highest);

	}

}
