package Programs_practice;

public class PrintSmallestElementsInArray {

	public static void main(String[] args) {
		int[] a = {99,468,23,62,19,39,41};
		int temp;
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

			
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Smallest element in array is:" + a[size-2]);

	}

}
