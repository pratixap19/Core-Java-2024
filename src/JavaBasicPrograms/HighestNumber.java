package JavaBasicPrograms;
//followed Naveen Automation
public class HighestNumber {

	public static void main(String[] args) {
		int a = 100;
		int b = 300;
		int c = 400;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest number");
		}
		else if(b>a && b>c) {
			System.out.println("b is the greatest number");
		}
		else {
			System.out.println("c is the greatest number");
		}

	}

}
