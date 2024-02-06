package Programs_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Sort The List Of Strings Using JavaCollection
public class SortTheListOfStringsUsingJavaCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Banana", "Strawberry", "Orange", "Chicoo", "Pineapple"));
		Collections.sort(list);
		System.out.println(list);
	}

}
