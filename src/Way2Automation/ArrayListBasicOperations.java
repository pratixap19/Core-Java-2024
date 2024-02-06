package Way2Automation;

import java.util.ArrayList;

public class ArrayListBasicOperations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(6);
		list.add(34);
		list.add(67);
		list.add(66);
		list.add(66);
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(1, 60);
		System.out.println(list.get(1));
		System.out.println(list.remove(2));
		System.out.println(list);
		//add an element at a specific index
		list.add(1, 66);
		list.add(2, 56);
		System.out.println(list);
		list.add(null);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.contains(56));
		System.out.println(list.indexOf(66));
		System.out.println(list.lastIndexOf(66));
		
		System.out.println("********************************");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(91);
		list1.add(92);
		list1.add(93);
		list.addAll(list1);
		System.out.println("Elemnets of tqo arrayList:" + list);
		
		
		
		

	}

}
