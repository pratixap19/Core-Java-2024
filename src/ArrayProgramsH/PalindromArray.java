package ArrayProgramsH;

public class PalindromArray {
	public static void main(String args[]) {
	int[] a= {1,2,3,4,5, 4, 3,2,1,};
	int start=0;
	int end=a.length-1;
	String msg = "Array is palindrom";
	while(start<end) {
		if(a[start]!=a[end]) {
			msg="Array is not a palindrom";
			break;
		}
		start++;
		end--;
	}
	System.out.println(msg);
	}

}
