package JavaBasicPrograms;
//followed Chirag Khimani
//diff bet reverse number and palindrom number
//1. in palindrom need to take temp variable
//add if() condition
//rest of the steps are the same

public class PalindromNumber {

	public static void main(String[] args) {
		int num =259;
		int temp=num;
		int rem, rev=0;
		
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev) {
				System.out.println("It is palindrom number");
		}
		else
		{
				System.out.println("It is not a palindrom number");
		}
		}
	}

