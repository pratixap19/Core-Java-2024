package JavaBasicPrograms;
//A prime number is a natural number greater than 1, which is only divisible by 
//1 and itself. First few prime numbers are 2, 3, 5, 7, 11, 13....
public class PrimeNumber {

	public static void main(String[] args) {
		int num=3;
		if(isPrime(num)) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime number");
		}
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num; i++) {
			if(num%i==0) {//17%2, 1 rem, 17%3rem 2
				return false;
			}
		}
		return true;
	}
}
