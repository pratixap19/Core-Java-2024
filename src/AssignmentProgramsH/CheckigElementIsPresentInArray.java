package AssignmentProgramsH;

public class CheckigElementIsPresentInArray {

	public static void main(String[] args) {
		int[] a = {2,5,8,10,15};
		int searchElement=8;
		boolean status=false;
		for(int value:a) {
			if(value==searchElement) {
				System.out.println("element is found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("element is not found");
		}

	}

}
