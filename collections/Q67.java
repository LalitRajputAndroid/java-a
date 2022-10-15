/* Write a Java program to get a collection view of the values contained in 
this map.*/
package Module2.collections;

import java.util.HashMap;

public class Q67 {
		public static void main(String[] args) {
			HashMap hMap = new HashMap<>();
			hMap.put(1, "name");
			hMap.put(2, "Age");
			hMap.put(3, "Address");
			hMap.put(4, "number");
			
			System.out.println(hMap.values());
		}
}
