package JavaBasicPrograms;

public class FindSecondLargestNumberInArray {
	
	public static void secondLargestElement() {
		int arr[] = {8,2,5};
		int temp;
		int size = arr.length;
		System.out.println("Array size is: " + size);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements in array in ascending order");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Second largest number is: " + arr[size-2]);
	}

	public static void main(String[] args) {
		secondLargestElement();

	}

}
