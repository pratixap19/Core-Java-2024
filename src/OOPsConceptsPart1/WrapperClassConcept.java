package OOPsConceptsPart1;
//followed Naveen Automation
public class WrapperClassConcept {
	
	public static void main(String[] args) {

		//Integer.parseInt() is called data conversion - String to int, int to String etc. 
		//Integer, Double, Character, Boolean are called wrapper class.
		
		String x = "100";
		System.out.println(x+20);
		
		//String to integer data conversion
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double data conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		//int to String conversion
		int j = 222;
		System.out.println(j+20);
		
		String q = String.valueOf(j);
		System.out.println(q+20);
		
		//NumberFormatException
		String p = "100A";//value should be complete integer. Here valu is not complete integer.
		int z = Integer.parseInt(p);
		System.out.println(z);//it will give NumberFormatException.
		
		
		
	}

}
