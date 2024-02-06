package ArrayProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToList {

	public static void main(String[] args) {
		String str ="SeleniumWithJava";
		
		//convert String into array
		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//convert array into arrayList/list
        List<Character> list = new ArrayList<Character>();
		
		for(char x:ch) {
			list.add(x);
		}
		
		System.out.println(list);

	}

}
