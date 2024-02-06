package Programs_practice;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(c);//1,2,3,5,8
			a=b;//1,2,3
			b=c;//1,5
		}

	}

}
