package NumberProgramsH;
//Print 1 to 20 numbers using for loop and while loop
public class Print1To20Numbers {

	public static void main(String[] args) {
	//First approach
		for(int i=1;i<=20;i++) {
		System.out.println(i);
	}
	System.out.println("*****************************");
	//Second approach
	int i=1;
	while(i<=20) {
		System.out.println(i);
		i++;
	}
	//Third approach - it is not recommended
	System.out.println("*****************************");
	int m=1;
	int j=2;
	int k=3;
	System.out.println(m);
	System.out.println(j);
	System.out.println(k);
}
}