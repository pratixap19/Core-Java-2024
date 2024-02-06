package JavaBasicPrograms;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int[] a = {37, 23, 57, 5, 1};
		int largest=a[0];//37
		int smallest=a[0];//37
		for(int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];//57
			}
			else if(a[i]<smallest){
				 smallest=a[i];//1
			}
		}
		System.out.println("Largest number is :" + largest);
		System.out.println("Smallest num is :" + smallest);

	}

}
