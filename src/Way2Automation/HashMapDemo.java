package Way2Automation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 1.used to store data in key-value pait
 * 2. a key value pair is also called as Entry or Bucket
 * 3. multiple entries together is called EntrySet
 * 4. Hashmap is a class implementing Map interface
 * 5. duplicate values are allowed
 * duplicate key is not allowd, if tried then it will update value
 * 6. only one null key is allowed
 * */
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Apple");
		map.put(2, "Mango");
		map.put(23,"Chickoo" );
		map.put(3, "Guava");
		map.put(4, "Guava");
		map.put(5, null);
		map.put(null, "orange");
		System.out.println(map);
		map.put(null, "ABC");
		
		System.out.println(map);
		
		//methods
		map.containsKey(23);//true
		map.containsValue("Orange12");//false
		map.remove(23);
		System.out.println(map.size());
		map.putIfAbsent(1, "XYZ");//if the same key is present and vlaue is null then it won't update
		System.out.println(map);
		
		//Set<Integer> keys = map.keySet();
		
		//read individual key and values
		for(Entry<Integer, String> x:map.entrySet()) {
			System.out.println("Key is " + x.getKey() + " " + "Value is " + x.getValue());
		}
		
		
		
	}

}
