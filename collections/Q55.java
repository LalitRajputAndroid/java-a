/* Write a Java program to reverse elements in an array list. */
package Module2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Q55 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			
			System.out.println(list);
			Collections.reverse(list);
			System.out.println("Reverse elements in Array list : "+list);
		}
}
