package StringProgramsP;

public class StringsAreImmutable {

	public static void main(String[] args) {
		String x = "Pratixa";
		String y= "Patel";
		//x= x.concat(y);
		 x.concat(y);
		System.out.println("String is immutable: " + x);
		
		StringBuffer sb1 = new StringBuffer("Pratixa");
		StringBuffer sb2 = new StringBuffer("Patel");
		sb1.append(sb2);
		System.out.println("String is mutable: " + sb1);

	}

}
