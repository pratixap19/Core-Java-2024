package Array;
//followed Naveen Automation
//disadvantage of arrays
//1. size of array is fixed -- static array -- to overcome of this problem -- we use Collections which is called dynamic array.
//2. stores only similar data types -- to overcome of this problem -- we use Object array. 
////Arrays methods are sort(), Equals(), copyOf(), fill(), binarySearch()
public class Arrays {

	public static void main(String[] args) {
		// 1. integer array
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[4]);
		System.out.println("Length of array is = " +a.length);
		
		// 2. String array
		String s[]={"Pratixa", "Java", "Learning",};
		System.out.println("Printing value at 0th index = " + s[0]);
		
		//3. double array
		double d[] = new double[4];
		d[0] = 12.33;
		d[1] = 34.22;
		d[2] = 24.89;
		d[3] = 54.45;
		
		System.out.println(d[1]);
		
		//4. character array
		
		char c[] = new char[3];
		c[0] = 'a' ;
		c[1] = 'A';
		c[2] = 'b';
		
		System.out.println(c[1]);
		
		//5. boolean array
		boolean b[] = new boolean[2];
		b[0]= true;
		b[1] = false;
		System.out.println(b[0]);
		
		//6. Object array is used to store different data types
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/2023";
		ob[4] = 'M';
		ob[5] = "London";
		System.out.println(ob[0]);
		System.out.println(ob.length);
	}

}
