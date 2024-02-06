package ArrayProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Yash");
		list.add("Smith");
		list.add("Jeniffer");
		
		//creating an arry with the length of list.size
		String[] a = new String[list.size()];
		
		//it will return an array containing all elements in list with proper sequence
		list.toArray(a);//
		
		//System.out.println(Arrays.toString(a));
		
		for(String x:a) {
			System.out.println(x);
		}
		
		
		

	}

}
