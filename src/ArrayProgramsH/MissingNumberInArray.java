package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
public class MissingNumberInArray {

	public static void main(String[] args) {
		//array should not have duplicates
		//array should not be in sorted order
		////values should be in proper range
		
		int a[]={1,2,3,4,5,7,8,9,10};
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15-12=3
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array" + sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array: " +sum2);
		System.out.println("missing number is:" + (sum2-sum1));
		

	}

}
