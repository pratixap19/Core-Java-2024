package JavaBasicPrograms;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int n1=20;
		int n2=30;
		System.out.println("Value before swap: " + n1 + "," + n2);
		
		
		n1 = n1+n2;//n1 = 50
		n2 = n1-n2;//20
		n1= n1-n2;
		
		System.out.println("Value after swap: " + n1 + "," + n2);
		
		

	}

}
