package StringProgramsP;
//followed ABC-Technology training & upskilling
/*
 * steps to followed
 * 1. create string onject with x refrence
 * 2. extract the data from String object and place it in a char array y
 * 3. compute length of array y
 * 4. create new array a with its size same as y
 * 5. create index variable i and assign it to 0
 * 6. copy data from y to a new array a.
 * 7. print statement
 * as long as(i!=size){
 * place the y[i] in a[i]
 * increment i
 * }
  */
public class CopyOneStringToAnotherString {

	public static void main(String[] args) {
		
		String x = "ABC Tech";
		char[] y = x.toCharArray();
		int size = y.length;
		char[] a = new char[size];
		int i=0;
		while(i!=size) {
			a[i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);

	}

}
