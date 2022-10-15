/* Write a Java program to count the number of key-value (size) mappings 
in a map.
*/
package Module2.collections;

import java.util.HashMap;

public class Q54 {
		public static void main(String[] args) {
			HashMap map = new HashMap<>();
			map.put(1, "Name");
			map.put(2, "Age");
			map.put(3, "number");
			map.put(4, "address");
			
			System.out.println(map);
			
			System.out.println("Number of Key-value : "+map.size());
		}
}
