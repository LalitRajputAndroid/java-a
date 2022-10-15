/* Write a Java program to insert an element into the array list at the first 
position.*/
package Module2.collections;

import java.util.ArrayList;

public class Q42 {
		public static void main(String[] args) {
			ArrayList ls = new ArrayList<>();
			ls.add(120);
			ls.add("java");
			ls.add(1.0);
			
			System.out.println(ls);
			ls.add(0, 'A');
			System.out.println("After add element : "+ls);
			
		}
}
