/* Write a Java program to check whether a map contains key-value 
mappings (empty) or not.*/
package Module2.collections;

import java.util.HashMap;
import java.util.Set;

public class Q62 {
		public static void main(String[] args) {
			HashMap<Integer, String> set = new HashMap<>();
			set.put(1, "india");
			set.put(2, "USA");
			set.put(3, "china");
			
			System.out.println(set.isEmpty());
			
			set.clear();
			
			System.out.println(set.isEmpty());
			  
		}
}
