/* Write a Java program to compare two array lists.
*/
package Module2.collections;

import java.util.ArrayList;

public class Q57 {
		public static void main(String[] args) {
			ArrayList list1 = new ArrayList<>();
			 list1.add(5);
			 list1.add(3);
			 list1.add(2);
			 list1.add(1);
			 list1.add(4);
			 
			 System.out.println(list1);
			 
			 ArrayList list2 = new ArrayList<>(); 
				list2.add(5);
				list2.add(3);
				list2.add(2);
				list2.add(1);
				list2.add(4);
				
			 System.out.println(list2);
			 
			 Boolean boolean1 =  list1.equals(list2);
			 
			 System.out.println(boolean1);
		}
}
