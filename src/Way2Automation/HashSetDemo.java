package Way2Automation;
/*rules
 * 1. Insertion order is not maintained
 * 2. Indexing is not maintained
 * 3.getters and setters are not available
 * duplicates are not allowed
 * one null value is allowed
 */
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(16);
		set.add(18);
		set.add(21);
		System.out.println(set);
		System.out.println(set.contains(16));
		
		
		

	}

}
