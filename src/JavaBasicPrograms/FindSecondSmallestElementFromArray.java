package JavaBasicPrograms;

public class FindSecondSmallestElementFromArray {

	public static void main(String[] args) {
		int[] arr = {6,9,17,45,69};
		int temp;
		int size = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements of array in descending order");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Second largest number is: " + arr[size-2]);
	}

}
