package ArrayProgramsH;
//followed software testing and automation by subhashish Mishra
public class MissingNumberInArray_secondApproach {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,8,9,10};
		int sum=0;
		int n=a.length;
		int totalSum=(n+1)*(n+2)/2;
		System.out.println("sum of all numbers is :" + totalSum);
		
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of the elements are: " + sum);
		int missingNumber=totalSum-sum;
		System.out.println("Missing number is: " + missingNumber);

	}

}
