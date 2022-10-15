/* Write a Java program to associate the specified value with the specified 
key in a HashMap.*/
package Module2.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q53 {
		public static void main(String[] args) {
			HashMap map = new HashMap<>();
			map.put(1, "Name");
			map.put(2, "Age");
			map.put(3, "number");
			map.put(4, "address");
			
			System.out.println(map);
		}
}
