package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		System.out.println(ls);
		
		for(Integer i:ls) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		 Iterator<Integer> i = ls.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 
		 LinkedList<String> ls1 = new LinkedList<String>();
		 ls1.add("Pratixa");
		 ls1.add("Hanuman");
		 ls1.add("Rajesh");
		 ls1.add("Rahul");
		 System.out.println(ls1);
		 ls1.add(0, "Raman");
		 System.out.println(ls1);
		 ls1.add("Smith");
		 System.out.println(ls1);
		 ls1.addFirst("Jinal");
		 System.out.println(ls1);
		 ls1.addLast("Nimesh");
		 System.out.println(ls1);
		 System.out.println(ls1.remove("Rahul"));
		 System.out.println(ls1);
		 
		 //ArrayList<String> as = new ArrayList<String>(ls1);
		 //as.addAll(ls1);
		 //System.out.println(as);
		 
		 
	}

}
