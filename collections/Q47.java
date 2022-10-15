/* Write a Java program to sort a given array list.
*/
package Module2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Q47 {
		public static void main(String[] args) {
			 ArrayList list = new ArrayList<>();
			 list.add(5);
			 list.add(3);
			 list.add(2);
			 list.add(6);
			 list.add(1);
			 list.add(4);
			 System.out.println(list);
			 Collections.sort(list);
			 
			 System.out.println("After sort Arraylist : "+list);
		}
}
