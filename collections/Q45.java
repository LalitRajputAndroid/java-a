/*  Write a Java program to remove the third element from an array list.
*/
package Module2.collections;

import java.util.ArrayList;

public class Q45 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList<>();
			list.add("age");
			list.add("salary");
			list.add("name");
			list.add("Date of Birth");
			
			System.out.println(list);
			list.remove(3);
			System.out.println(list);
		}
}
