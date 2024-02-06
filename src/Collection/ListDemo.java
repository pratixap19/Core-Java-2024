package Collection;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Ali");
		names.add("Smith");
		//names.remove(1);
		
		
		//get elements
		System.out.println(names.get(2));
		
		//get all elements use for loop
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
	}

}
