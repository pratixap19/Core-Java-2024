package Practice;

import java.util.ArrayList;

public class ArrayAndArrayListPractice {

	public static void main(String[] args) {
		
		String arr[] = {"Ram", "Shyam", "Bharat"};
		System.out.println("Length of array is "+ arr.length);
		
		ArrayList<String> as = new ArrayList<>();
		as.add("Ram");
		as.add("Shyam");
		as.add("Bharat");
		as.add("Ganesh");
		System.out.println(as);
		
//		System.out.println("Lengh of attayList is " + as.size());
//		System.out.println(as.get(1));
//		System.out.println(as);
//		System.out.println(as.remove(1));
//		System.out.println(as);
//		//System.out.println(as.add(null));
//		System.out.println(as.add("Shyam"));
//		System.out.println(as);
//		System.out.println(as.set(2,"Shiv"));
//		System.out.println(as);
		
		
		ArrayList<String> al = new ArrayList<>(as);
		
		//al.addAll(as);
		System.out.println(al);
		//as.add("Lakshman");
		System.out.println(as);
		System.out.println(al);
		System.out.println(al.contains("Lakshman"));
		System.out.println(as.containsAll(al));
		
		//System.out.println(as.isEmpty());
		//System.out.println(as.removeAll(as));
		//as.clear();
	}

}
