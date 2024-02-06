package Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,"Ram");
		hm.put(2, "Shyam");
		hm.put(3, "Ganesh");
		hm.put(4, "Shiva");
		hm.put(5, "Smith");
		hm.put(6, "Nimesh");
		hm.put(4, "Parvati");
		hm.put(null, "Rohan");
		hm.put(10, "Vishnu");
		
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Ganesh"));
		System.out.println("Value of specified key is: " + hm.get(3));
		System.out.println(hm.isEmpty());
		hm.replace(6, "Himesh");
		System.out.println(hm);
		System.out.println(hm.size());
		
		//1st approach
		//entrySet(), getKey() and getValue() methods 
		for(Map.Entry<Integer, String> i:hm.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
//		  Iterator<Integer> i = hm.keySet().iterator();
//		   String  value = hm.get("Ganesh");
//		   hm.get
		    
		  //System.out.println(hm.get("Ganesh"));
		   
		//How to fetch all the keys and all the values from a map?
		//We can use keySet() and values() methods
		
		//2nd approach
		  Set<Integer> keys = hm.keySet();
		  for(Integer key:keys) {
			  System.out.println(key);
		  }
		  
		  System.out.println("************************");
		  
		   Collection<String> values = hm.values();
		   for(String value:values) {
			   System.out.println(value);
		   }
		   
		   System.out.println("************************");
		   
		  //3rd approach - using Set and Iterator interface
		    Set<Entry<Integer, String>> set = hm.entrySet();
		    //System.out.println(set);
		    Iterator<Entry<Integer, String>> itr = set.iterator();
		    while(itr.hasNext()){
		    	//System.out.println
		    	Map.Entry entry = (Map.Entry) itr.next();
		    	System.out.println(entry.getKey() + ":" + entry.getValue());
		    }
		    
		    System.out.println("************************");
		   
		   
		  //4th approach - without using Set and Iterator interface
		   
		  
		   
		   

	}

}
