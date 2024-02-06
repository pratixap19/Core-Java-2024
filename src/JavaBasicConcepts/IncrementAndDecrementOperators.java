package JavaBasicConcepts;
//followed Naveen Automation
public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;// post increment
		System.out.println("value of i is:" + i);
		System.out.println("value of j is:" + j);

		int a = 1;
		int b = ++a;// pre increment
		System.out.println("value of a is:" + a);
		System.out.println("value of b is:"+ b);
		
		int m=2;
		int n=m--;//post decrement
		System.out.println("value of m is:" + m);
		System.out.println("value of n is:" +n);
		
		int p = 2;
		int q = --p;//pre decrement
		
		System.out.println("value of p is:" + p);
		System.out.println("value of q is:" +q);
	}

}
