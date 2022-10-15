/* Write a Java program to iterate through all elements in an array list.*/
package Module2.collections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Q41 {
		public static void main(String[] args) {
			List list = new ArrayList<>();
			list.add("Lalit");
			list.add(21);
			list.add(10.2);
			
			System.out.println("All elements = "+list);
			
			Iterator itr = list.iterator();
			
			while (itr.hasNext()) {
				
				System.out.println(itr.next());
			}
		}
}
