package ArrayProgramsH;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
	
		String[] colors= {"Red", "Green","Yellow", "White"};
		
		//Create List 
		List<String> list = new ArrayList<String>();
		
		for(String x:colors) {
			list.add(x);
		}
		System.out.println(list);
	}

}
