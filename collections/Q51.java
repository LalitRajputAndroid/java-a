/* Write a Java program to iterate through all elements in a hash list.*/
package Module2.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q51 {
		public static void main(String[] args) {
			HashSet hs = new HashSet<>();
			hs.add(1);
			hs.add("Red");
			hs.add(10.1);
			hs.add("Black");
			
			System.out.println(hs);
			
			Iterator se = hs.iterator();
			
			while (se.hasNext()) {
				
				System.out.println(se.next());
			}
		}
}
