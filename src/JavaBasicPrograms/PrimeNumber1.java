package JavaBasicPrograms;
//A prime number is a natural number greater than 1, which is only divisible by 
//1 and itself. First few prime numbers are 2, 3, 5, 7, 11, 13....
public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=5;
		//here we need to check if it is devisible by 2,3 and 4 so we need to 
		//run for loop from 2 to num-1
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("This is a prime number");
		}else {
			System.out.println("This is not a prime number");
		}
	}

}
