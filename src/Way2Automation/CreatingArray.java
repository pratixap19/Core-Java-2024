package Way2Automation;

public class CreatingArray {

	public static void main(String[] args) {
		
		int[] id=new int[10];
			
		for(int i=0;i<id.length;i++) {
			id[i]=(i+1)*10;
		}
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]);
		}

	}

}
