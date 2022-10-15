/* Write a Java program to extract a portion of an array list. */
package Module2.collections;

import java.util.ArrayList;

public class Q56 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			
			System.out.println(list.subList(0, 3));
		}
}
