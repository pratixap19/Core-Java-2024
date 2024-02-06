package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
public class SearchingElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		int search_Element=30;
		boolean status=false; //false=not found
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==search_Element) {
//				System.out.println("Element found");
//				status=true;
//				break;
//			}
//		}
		for(int x:a) {
			if(x==search_Element) {
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}

	}

}
